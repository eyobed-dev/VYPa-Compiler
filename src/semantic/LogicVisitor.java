
/*
 * Project: VYPacompiler
 * Authors: xnuriey00, xarchaj00
 */
package semantic;

import parser.VYPlanguageBaseVisitor;
import parser.VYPlanguageParser;

public class LogicVisitor extends VYPlanguageBaseVisitor<Void> {
    private Scope currentScope;

    public LogicVisitor(Scope globalScope) {
        this.currentScope = globalScope;
    }

    @Override
    public Void visitFunctionDefinition(VYPlanguageParser.FunctionDefinitionContext ctx) {
        // Create a new scope for the function
        currentScope = new Scope(currentScope);

        // Define parameters in this scope
        if (ctx.paramList() != null) {
            // Iterate over parameters (dataType ID, dataType ID...)
            // This requires a bit of manual list traversal in ANTLR 4
            int i = 0;
            for (var typeCtx : ctx.paramList().dataType()) {
                String type = typeCtx.getText();
                String name = ctx.paramList().ID(i).getText();
                currentScope.define(new Symbol(name, type));
                i++;
            }
        }

        // Visit the code block
        visit(ctx.block());

        // Pop the scope (return to parent)
        currentScope = currentScope.parent;
        return null;
    }

    @Override
    public Void visitBlock(VYPlanguageParser.BlockContext ctx) {
        // Blocks also create a scope
        currentScope = new Scope(currentScope);
        super.visitBlock(ctx); // Visit all statements
        currentScope = currentScope.parent;
        return null;
    }

    @Override
    public Void visitVarDefinition(VYPlanguageParser.VarDefinitionContext ctx) {
        String type = ctx.dataType().getText();

        for (var decl : ctx.varDecl()) {
            String name = decl.ID().getText();
            currentScope.define(new Symbol(name, type));

        }
        return null;
    }

    // --- FIX: Check Left-Hand Side of Assignments (L-Values) ---
    @Override
    public Void visitLvalue(VYPlanguageParser.LvalueContext ctx) {
        // If this is a simple assignment like "x = 5" (no dots)
        if (ctx.expression() == null) {
            String name = ctx.ID().getText();
            Symbol sym = currentScope.resolve(name);

            if (sym == null) {
                System.err.println("Semantic Error: Undefined variable '" + name + "' assigned on line " + ctx.start.getLine());
                System.exit(14); // Error 14: Undefined
            }
        } else {
            // It is "obj.x = 5". Check if "obj" exists.
            visit(ctx.expression());
        }
        return null;
    }

    @Override
    public Void visitIdExpr(VYPlanguageParser.IdExprContext ctx) {
        String name = ctx.ID().getText();
        Symbol sym = currentScope.resolve(name);

        if (sym == null) {
            System.err.println("Semantic Error: Undefined variable '" + name + "' on line " + ctx.start.getLine());
            System.exit(14); //  Error 14: Undefined
        }
        return null;
    }
}
