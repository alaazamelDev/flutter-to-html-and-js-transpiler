package utils;

import java.util.HashMap;
import java.util.Stack;

public class SymbolTable {
    private Stack<HashMap<String, Symbol>> scopes;

    private static SymbolTable instance;

    private SymbolTable() {
        scopes = new Stack<HashMap<String, Symbol>>();
        scopes.push(new HashMap<String, Symbol>());
    }


    public void enterScope() {
        scopes.push(new HashMap<String, Symbol>());
    }

    public void exitScope() {
        scopes.pop();
    }

    public void put(String name, Symbol sym) {
        scopes.peek().put(name, sym);
    }

    public Symbol get(String name) {
        for (int i = scopes.size() - 1; i >= 0; i--) {
            Symbol sym = scopes.get(i).get(name);
            if (sym != null) {
                return sym;
            }
        }
        return null;
    }

    public boolean contains(String name) {
        return get(name) != null;
    }

    public static SymbolTable getInstance() {
        if (instance == null) {
            instance = new SymbolTable();
        }
        return instance;
    }

}
