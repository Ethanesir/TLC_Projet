package tableSymbole;

import java.util.ArrayList;

public class TableSymbole {
    public String name; // Le nom. Exemple : Result
    public String kind; // Le type. Exemple : variable
    public int line; // La ligne
    public ArrayList<TableSymbole> link; // Lien vers un bloc. Exemple : null car Result est une variable

    @Override
    public String toString() {
        return toString(0);
    }

    private String toString(int depth) {
        StringBuilder sb = new StringBuilder();
        sb.append(getIndentation(depth)).append("\n");
        sb.append(getIndentation(depth + 1)).append(String.format("name: %s\n", name));
        sb.append(getIndentation(depth + 1)).append(String.format("kind: %s\n", kind));
        sb.append(getIndentation(depth + 1)).append(String.format("line: %d\n", line));
        sb.append(getIndentation(depth + 1)).append("link: ").append(linkToString(depth + 1)).append("\n");
        return sb.toString();
    }

    private String linkToString(int depth) {
        if (link == null) {
            return "null";
        }

        StringBuilder linkString = new StringBuilder("[");
        for (TableSymbole symbole : link) {
            linkString.append(symbole.toString(depth + 1));
        }
        linkString.append(getIndentation(depth)).append("]");

        return linkString.toString();
    }

    private String getIndentation(int depth) {
        StringBuilder indentation = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            indentation.append("  "); // Utilisation de deux espaces pour l'indentation
        }
        return indentation.toString();
    }
}
