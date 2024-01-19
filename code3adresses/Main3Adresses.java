package code3adresses;// Classe représentant un nœud dans l'AST

class Main3Adresses {
    static int incr_bal=0;
    static int incr_res=0;
    public static void main(String[] args) {
        // Exemple d'AST
        ASTNode assignmentNode = new Assignment( "x",new BinaryOperation("*", new Symbol( "x"), new Symbol("0")));

        IfStatement ifNode = new IfStatement(new BinaryOperation(">", new Symbol( "x"), new Symbol("0")), assignmentNode, null);

        WhileLoop whileNode = new WhileLoop("x > 0", ifNode);

        // Appel de la fonction pour générer le code à trois adresses
        ThreeAddressCodeGenerator.generateThreeAddressCode(whileNode);
    }
}
