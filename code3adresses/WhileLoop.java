package code3adresses;

// Classe représentant une boucle While dans l'AST
class WhileLoop extends ASTNode {
    String condition;
    ASTNode body;

    WhileLoop(String condition, ASTNode body) {
        super("WhileLoop", null);
        this.condition = condition;
        this.body = body;
    }
}
