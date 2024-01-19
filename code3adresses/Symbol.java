package code3adresses;

class Symbol extends ASTNode {

    Symbol(String value) {
        super("Symbol", value);
        this.left = null;
        this.right = null;
    }
}
