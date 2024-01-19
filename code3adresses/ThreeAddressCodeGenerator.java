package code3adresses;

// Classe pour générer le code à trois adresses à partir de l'AST
class ThreeAddressCodeGenerator {
    static void generateThreeAddressCode(ASTNode node) {
        if (node == null) {
            return;
        }

        // Génération du code en fonction du type d'opération
        if ("Assignment".equals(node.operation)) {

            generateThreeAddressCode(((Assignment) node).right);
            int r1 = Main3Adresses.incr_res - 1;
            System.out.println(node.value + " = R" + r1);
        } else if ("IfStatement".equals(node.operation)) {
            int i1 = Main3Adresses.incr_bal;
            Main3Adresses.incr_bal = Main3Adresses.incr_bal + 1;
            int i2 = Main3Adresses.incr_bal;
            Main3Adresses.incr_bal = Main3Adresses.incr_bal + 1;


            generateThreeAddressCode(((IfStatement) node).condition);
            int r1 = Main3Adresses.incr_res - 1;
            System.out.println("if R" + r1 + " goto L" + i1);

            // Générer le code pour la branche "then"
            generateThreeAddressCode(((IfStatement) node).thenBranch);

            // Générer le code pour la branche "else" s'il y en a une
            if (((IfStatement) node).elseBranch != null) {
                System.out.println("goto L" + i2);
                System.out.println("L" + i1 + ":");
                generateThreeAddressCode(((IfStatement) node).elseBranch);
                System.out.println("L" + i2 + ":");
            } else {
                System.out.println("L" + i1 + ":");
            }
            // Générer le code pour les sous-arbres gauche et droit
            generateThreeAddressCode(node.left);
            generateThreeAddressCode(node.right);
        } else if ("WhileLoop".equals(node.operation)) {
            // Générer du code pour une boucle While
            int i1 = Main3Adresses.incr_bal;
            Main3Adresses.incr_bal = Main3Adresses.incr_bal + 1;
            int i2 = Main3Adresses.incr_bal;
            Main3Adresses.incr_bal = Main3Adresses.incr_bal + 1;
            System.out.println("L" + i1 + ":");
            System.out.println("if " + ((WhileLoop) node).condition + " goto L" + i2);

            // Générer le code pour le corps de la boucle
            generateThreeAddressCode(((WhileLoop) node).body);

            System.out.println("goto L" + i1);
            System.out.println("L" + i2 + ":");
            // Générer le code pour les sous-arbres gauche et droit
            generateThreeAddressCode(node.left);
            generateThreeAddressCode(node.right);
        } else if ("BinaryOperation".equals(node.operation)) {
            // Générer du code pour une opération binaire
            String op = ((BinaryOperation) node).operator;
            generateThreeAddressCode(((BinaryOperation) node).left);
            generateThreeAddressCode(((BinaryOperation) node).right);
            int r1 = Main3Adresses.incr_res;
            Main3Adresses.incr_res = Main3Adresses.incr_res + 1;
            int r2 = Main3Adresses.incr_res - 2;
            int r3 = Main3Adresses.incr_res - 3;
            System.out.println("R" + r1 + " = " + "R" + r3 + " " + op + " " + "R" + r2);
        } else if ("Symbol".equals(node.operation)) {
            // Générer du code pour une opération binaire
            String val = ((Symbol) node).value;
            int r1 = Main3Adresses.incr_res;
            Main3Adresses.incr_res = Main3Adresses.incr_res + 1;
            System.out.println("R" + r1 + "=" + val);
        }


    }
}
