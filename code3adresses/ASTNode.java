package code3adresses;

class ASTNode {
    String operation; // Type d'opération (par exemple, "Assignment", "IfStatement", etc.)
    String value;     // Valeur ou variable associée au nœud
    ASTNode left;
    ASTNode right;

    ASTNode(String operation, String value) {
        this.operation = operation;
        this.value = value;
        this.left = null;
        this.right = null;
    }
}
