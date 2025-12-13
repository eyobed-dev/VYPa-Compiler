package semantic;

import parser.VYPlanguageBaseVisitor;
import parser.VYPlanguageParser;

public class DefinitionVisitor extends VYPlanguageBaseVisitor<Void> {
    public Scope globalScope;

    public DefinitionVisitor() {
        globalScope = new Scope(null);
        initBuiltIns();
    }

    //embedded functions page 9
    private void initBuiltIns() {
        globalScope.define(new Symbol("print", "void"));
        globalScope.define(new Symbol("readInt", "int"));
        globalScope.define(new Symbol("readString", "string"));
        globalScope.define(new Symbol("length", "int"));
        globalScope.define(new Symbol("substr", "string"));
        // Object class methods
        globalScope.define(new Symbol("toString", "string"));
    }

    @Override
    public Void visitFunctionDefinition(VYPlanguageParser.FunctionDefinitionContext ctx) {
        String typeStr = ctx.returnType().getText();
        String name = ctx.ID().getText();

        // Register the function in the Global Scope
        globalScope.define(new Symbol(name, typeStr));

        return null; // We do NOT visit the body yet. That is Pass 2.
    }

    @Override
    public Void visitClassDefinition(VYPlanguageParser.ClassDefinitionContext ctx) {
        String name = ctx.ID(0).getText();
        globalScope.define(new Symbol(name, name)); // Class names are also symbols
        return null;
    }
}
