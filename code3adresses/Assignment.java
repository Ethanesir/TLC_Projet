package code3adresses;

class Assignment extends ASTNode {

    Assignment(String value, ASTNode right) {
        super("Assignment", value);
        this.right = right;
    }
}
