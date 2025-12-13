package src;

import org.antlr.v4.runtime.*;
import parser.*; // Imports the code ANTLR generates
import semantic.*;
import codegen.CodeGenerator;

import java.io.PrintWriter;
import java.io.IOException;

public class Compiler {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Error: No input file.");
            System.exit(19); //[error 19: internal compiler error : page 2]
        }

        try {
            // 1. Read the input file
            CharStream input = CharStreams.fromFileName(args[0]);

            // 2. Split it into tokens (Lexer)
            VYPlanguageLexer lexer = new VYPlanguageLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // 3. Organize tokens into sentences (Parser)
            VYPlanguageParser parser = new VYPlanguageParser(tokens);

            // 4. Start parsing at the 'program' rule... questionable...
            parser.program();

            // 1. Reset parser to read the tree again
            parser.reset();
            VYPlanguageParser.ProgramContext tree = parser.program();

            // 2. Semantic Analysis - Pass 1 (Gather Definitions)
            DefinitionVisitor defVisitor = new DefinitionVisitor();
            defVisitor.visit(tree);

            // 3. Check for Main [error 14: semantic error : page 2]
            if (defVisitor.globalScope.resolve("main") == null) {
                System.err.println("Error: Missing main function.");
                System.exit(14);
            }

            // 4. Semantic Analysis - Pass 2 (Check Bodies)
            LogicVisitor logicVisitor = new LogicVisitor(defVisitor.globalScope);
            logicVisitor.visit(tree);

            String outputFile = (args.length > 1) ? args[1] : "out.vc"; // [page 2]

            CodeGenerator codegen = new CodeGenerator();
            codegen.visit(tree);

            try (PrintWriter out = new PrintWriter(outputFile)) {
                out.print(codegen.getOutput());
            }
            // If we survive this, Semantics is (mostly) okay!
            System.exit(0);

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            System.exit(19);
        }
    }
}
