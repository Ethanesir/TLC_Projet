package code3adresses;

// Classe représentant une opération binaire dans l'AST
class BinaryOperation extends ASTNode {
    String operator;

    BinaryOperation(String operator, ASTNode left, ASTNode right) {
        super("BinaryOperation", null);
        this.operator = operator;
        this.left = left;
        this.right = right;
    }
}
