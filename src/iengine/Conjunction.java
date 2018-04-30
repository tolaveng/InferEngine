package iengine;

/**
    Define Five Logical Connection
    ~   not
    &   and
    |   or
    =>  implication
    <=> biconditional

    *
    * @author Tola Veng
    *
 */

public enum Conjunction {
    NOT("~"),
    AND("&"),
    OR("|"),
    IMPLICATION("=>"),
    BICONDITIONAL("<=>");

    private final String conj;

    private Conjunction( String conj){
        this.conj = conj;
    }



    @Override
    public String toString() {
        return conj;
    }


}
