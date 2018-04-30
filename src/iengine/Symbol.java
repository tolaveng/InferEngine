package iengine;

/**
 Proposition symbol
 symbol name is case insensitive
 value True or False

 *
 * @author Tola Veng
 *
 */

public class Symbol {
    private String symbol;
    private boolean value;

    private Symbol(){
        // no default constructor
    }

    public Symbol(String symbol, boolean value){
        this.symbol = symbol.toUpperCase();
        this.value = value;
    }


    public boolean getValue(){
        return this.value;
    }

    public void setValue (boolean value){
        this.value = value;
    }

    public String getSymbol() {
        return symbol;
    }

    @Override
    public boolean equals(Object o) {
        if ((o == null) || (this.getClass() != o.getClass())) {
            return false;
        }
        Symbol sym = (Symbol)o;
        return (symbol.equalsIgnoreCase(sym.getSymbol()) && value == sym.getValue());

    }

    @Override
    public String toString() {
        return symbol + ":" + value;
    }


}
