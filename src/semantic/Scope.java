package semantic;
import java.util.HashMap;
import java.util.Map;

public class Scope {
    public Scope parent; // The outer scope
    private Map<String, Symbol> symbols = new HashMap<>();

    public Scope(Scope parent) {
        this.parent = parent;
    }

    public void define(Symbol sym) {
        if (symbols.containsKey(sym.name)) {
            System.err.println("Semantic Error: Redefinition of variable '" + sym.name + "'");
            System.exit(14); // page 2 Error 14: Multiple definition
        }
        symbols.put(sym.name, sym);
    }

    public Symbol resolve(String name) {
        Symbol s = symbols.get(name);
        if (s != null) return s;

        // If not found here, check the parent (outer scope)
        if (parent != null) return parent.resolve(name);

        return null; // Not found
    }
}
