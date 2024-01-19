package code3adresses;

// Classe représentant une instruction If dans l'AST
class IfStatement extends ASTNode {
    BinaryOperation condition;
    ASTNode thenBranch;
    ASTNode elseBranch;

    IfStatement(BinaryOperation condition, ASTNode thenBranch, ASTNode elseBranch) {
        super("IfStatement", null);
        this.condition = condition;
        this.thenBranch = thenBranch;
        this.elseBranch = elseBranch;
    }
}
