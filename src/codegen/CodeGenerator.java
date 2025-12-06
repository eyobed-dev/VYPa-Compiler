package codegen;

import parser.VYPlanguageBaseVisitor;
import parser.VYPlanguageParser;

public class CodeGenerator extends VYPlanguageBaseVisitor<Void> {
    private StringBuilder sb = new StringBuilder();

    public String getOutput() {
        return sb.toString();
    }

    private void emit(String instr) {
        sb.append(instr).append("\n");
    }

    private void emitLabel(String label) {
        sb.append("LABEL ").append(label).append("\n");
    }

    @Override
    public Void visitProgram(VYPlanguageParser.ProgramContext ctx) {
        // [cite: 395-399] Header
        emit("#!/bin/vypint");
        emit("# VYPcode: 1.0");
        emit("");

        // Entry point: Jump to main
        emit("JUMP main");
        emit("");

        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitFunctionDefinition(VYPlanguageParser.FunctionDefinitionContext ctx) {
        String name = ctx.ID().getText();
        emitLabel(name);

        visit(ctx.block());

        // FIX: Removed "RETURN $PC".
        // For 'main', falling off the end of the file exits the program.
        // For other functions, we will eventually need "RETURN $RA" (Return Address),
        // but for Hello World, doing nothing is safer than crashing.

        return null;
    }

    @Override
    public Void visitFunCallExpr(VYPlanguageParser.FunCallExprContext ctx) {
        String funcName = ctx.ID().getText();

        if (funcName.equals("print")) {
            if (ctx.argList() != null) {
                for (var expr : ctx.argList().expression()) {
                    visit(expr); // Puts result in $0
                    emit("WRITES $0");
                }
            }
        }
        return null;
    }

    @Override
    public Void visitStringExpr(VYPlanguageParser.StringExprContext ctx) {
        String text = ctx.getText();
        // VYPcode allows string literals in SET instructions [cite: 436]
        emit("SET $0, " + text);
        return null;
    }
}
