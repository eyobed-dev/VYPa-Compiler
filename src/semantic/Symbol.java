/*
 * Project: VYPacompiler
 * Authors: xnuriey00, xarchaj00
 */
package semantic;

public class Symbol {
    public String name;
    public String type; // "int", "string", "void", or Class Name

    public Symbol(String name, String type) {
        this.name = name;
        this.type = type;
    }
}
