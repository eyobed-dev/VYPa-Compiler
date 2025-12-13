package codegen;

import parser.VYPlanguageBaseVisitor;
import parser.VYPlanguageParser;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class CodeGenerator extends VYPlanguageBaseVisitor<Void> {
    private StringBuilder sb = new StringBuilder();
    private Map<String, Integer> varOffsets = new HashMap<>();
    private Stack<Map<String, Integer>> scopeStack = new Stack<>();
    private int stackIndex = 0;
    private int labelCounter = 0;

    public String getOutput() {
        return sb.toString();
    }

    private void emit(String instr) {
        sb.append(instr).append("\n");
    }

    private void emitLabel(String label) {
        sb.append("LABEL ").append(label).append("\n");
    }

    private String newLabel() {
        return "L_" + (labelCounter++);
    }

    // Scope management for proper variable shadowing
    private void pushScope() {
        scopeStack.push(new HashMap<>(varOffsets));
    }

    private void popScope() {
        if (!scopeStack.isEmpty()) {
            varOffsets = scopeStack.pop();
        }
    }

    @Override
    public Void visitProgram(VYPlanguageParser.ProgramContext ctx) {
        emit("#!/bin/vypint");
        emit("# VYPcode: 1.0");
        emit("");
        // fuck this : fixed: Use JUMPZ with 0 for unconditional jump
        emit("JUMPZ main, 0");
        emit("");
        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitFunctionDefinition(VYPlanguageParser.FunctionDefinitionContext ctx) {
        String name = ctx.ID().getText();
        emitLabel(name);

        varOffsets.clear();
        scopeStack.clear();
        stackIndex = 0;

        visit(ctx.block());

        emit("SET $0, 0");
        // Implicit return at end of function
        emit("");
        return null;
    }

    @Override
    public Void visitBlock(VYPlanguageParser.BlockContext ctx) {
        pushScope();
        super.visitBlock(ctx);
        popScope();
        return null;
    }

    @Override
    public Void visitStatement(VYPlanguageParser.StatementContext ctx) {
        if (ctx.ASSIGN() != null) {
            visit(ctx.expression());
            String name = ctx.lvalue().getText();
            if (varOffsets.containsKey(name)) {
                emit("SET [" + varOffsets.get(name) + "], $0");
            }
            return null;
        }

        // IF Statement
        if (ctx.IF() != null) {
            String labelElse = newLabel();
            String labelEnd = newLabel();

            visit(ctx.expression()); // Result in $0

            // Jump to ELSE if False (0)
            emit("JUMPZ " + labelElse + ", $0");

            visit(ctx.block(0)); // True block

            // FIX: Unconditional jump to END
            emit("JUMPZ " + labelEnd + ", 0");

            emitLabel(labelElse);
            if (ctx.ELSE() != null) {
                visit(ctx.block(1)); // Else block
            }

            emitLabel(labelEnd);
            return null;
        }

        // WHILE Loop
        if (ctx.WHILE() != null) {
            String labelStart = newLabel();
            String labelEnd = newLabel();

            emitLabel(labelStart);

            visit(ctx.expression()); // Check Condition

            // Exit if False
            emit("JUMPZ " + labelEnd + ", $0");

            visit(ctx.block(0)); // Body

            // Loop back (Unconditional)
            emit("JUMPZ " + labelStart + ", 0");

            emitLabel(labelEnd);
            return null;
        }

        return super.visitStatement(ctx);
    }

    // --- RELATIONS ---
    @Override
    public Void visitRelExpr(VYPlanguageParser.RelExprContext ctx) {
        visit(ctx.expression(0));
        int tempSlot = stackIndex++;
        emit("SET [" + tempSlot + "], $0");

        visit(ctx.expression(1));
        stackIndex--;
        emit("SET $1, [" + tempSlot + "]");

        if (ctx.LT() != null)
            emit("LTI $0, $1, $0");
        else if (ctx.GT() != null)
            emit("GTI $0, $1, $0");
        else if (ctx.LE() != null) {
            // LE (<=) is NOT (GT)
            emit("GTI $0, $1, $0");
            emit("NOT $0, $0");
        } else if (ctx.GE() != null) {
            // GE (>=) is NOT (LT)
            emit("LTI $0, $1, $0");
            emit("NOT $0, $0");
        }
        return null;
    }

    @Override
    public Void visitEqExpr(VYPlanguageParser.EqExprContext ctx) {
        visit(ctx.expression(0));
        int tempSlot = stackIndex++;
        emit("SET [" + tempSlot + "], $0");

        visit(ctx.expression(1));
        stackIndex--;
        emit("SET $1, [" + tempSlot + "]");

        if (ctx.EQ() != null)
            emit("EQI $0, $1, $0");
        else {
            emit("EQI $0, $1, $0");
            emit("NOT $0, $0");
        }
        return null;
    }

    // --- STANDARD VISITORS ---
    @Override
    public Void visitVarDefinition(VYPlanguageParser.VarDefinitionContext ctx) {
        for (var decl : ctx.varDecl()) {
            String name = decl.ID().getText();
            varOffsets.put(name, stackIndex);
            int mySlot = stackIndex++;
            if (decl.expression() != null) {
                visit(decl.expression());
                emit("SET [" + mySlot + "], $0");
            }
        }
        return null;
    }

    @Override
    public Void visitIdExpr(VYPlanguageParser.IdExprContext ctx) {
        String name = ctx.ID().getText();
        if (varOffsets.containsKey(name))
            emit("SET $0, [" + varOffsets.get(name) + "]");
        return null;
    }

    @Override
    public Void visitIntExpr(VYPlanguageParser.IntExprContext ctx) {
        emit("SET $0, " + ctx.getText());
        return null;
    }

    @Override
    public Void visitStringExpr(VYPlanguageParser.StringExprContext ctx) {
        emit("SET $0, " + ctx.getText());
        return null;
    }

    @Override
    public Void visitAddSubExpr(VYPlanguageParser.AddSubExprContext ctx) {
        visit(ctx.expression(0));
        int tempSlot = stackIndex++;
        emit("SET [" + tempSlot + "], $0");
        visit(ctx.expression(1));
        stackIndex--;
        emit("SET $1, [" + tempSlot + "]");
        if (ctx.PLUS() != null)
            emit("ADDI $0, $1, $0");
        else
            emit("SUBI $0, $1, $0");
        return null;
    }

    @Override
    public Void visitMulDivExpr(VYPlanguageParser.MulDivExprContext ctx) {
        visit(ctx.expression(0));
        int tempSlot = stackIndex++;
        emit("SET [" + tempSlot + "], $0");
        visit(ctx.expression(1));
        stackIndex--;
        emit("SET $1, [" + tempSlot + "]");
        if (ctx.MUL() != null)
            emit("MULI $0, $1, $0");
        else
            emit("DIVI $0, $1, $0");
        return null;
    }

    @Override
    public Void visitFunCallExpr(VYPlanguageParser.FunCallExprContext ctx) {
        if (ctx.ID().getText().equals("print")) {
            for (var expr : ctx.argList().expression()) {
                visit(expr);
                if (expr instanceof VYPlanguageParser.StringExprContext)
                    emit("WRITES $0");
                else
                    emit("WRITEI $0");
            }
        }
        return null;
    }
}