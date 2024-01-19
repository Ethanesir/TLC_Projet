package tableSymbole;

import org.antlr.runtime.tree.CommonTree;

import java.util.ArrayList;

import static myantlr.Projet_WhileParser.*;
import static myantlr.Projet_WhileParser.COMANDES;

public class VisitAST {
    public static ArrayList<TableSymbole> tableSymbole = new ArrayList<>();
    public void visitCommonTree(CommonTree t) {
        if ( t != null ) {
            if (t.getParent() == null){

                for (int i = 0; i <t.getChildCount(); i ++) {
                    ArrayList<TableSymbole> globalTableSymbole = new ArrayList<>();
                    TableSymbole tsFonction = new TableSymbole();
                    tsFonction.kind= "fonction";
                    tsFonction.line= t.getChild(i).getLine();
                    if (t.getChildCount() > 1) {
                        tsFonction.name= t.getChild(i).getChild(0).getText();
                        tsFonction.link = visitorFonction((CommonTree) t.getChild(i).getChild(0), globalTableSymbole);
                    } else {
                        tsFonction.name= t.getChild(i).getText();
                        tsFonction.link = visitorFonction((CommonTree) t.getChild(i), globalTableSymbole);
                    }
                    tableSymbole.add(tsFonction);
                }
                System.out.println(tableSymbole);

            }
        }


    }

    public ArrayList<TableSymbole> visitorFonction(CommonTree ast, ArrayList<TableSymbole> globalTableSymbole){

        int taille = ast.getChildCount();
        for (int i = 0; i < taille; i++) {
            switch (ast.getChild(i).getType()) {
                case INPUT:
                    ArrayList<TableSymbole> inputList = visitorInput((CommonTree) ast.getChild(i));
                    for (TableSymbole ts: inputList) {
                        globalTableSymbole.add(ts);
                    }
                    break;
                case COMANDES:
                    TableSymbole tsFonctionCommande = new TableSymbole();
                    tsFonctionCommande.kind= "ContenuFonction";
                    tsFonctionCommande.name= "ContenuFonction";
                    tsFonctionCommande.line = ast.getChild(i).getLine();
                    ArrayList<TableSymbole> blocForCommandeTableSymbole = new ArrayList<>();
                    tsFonctionCommande.link = visitorCommandes((CommonTree) ast.getChild(i), blocForCommandeTableSymbole);
                    globalTableSymbole.add(tsFonctionCommande);
                    break;
                case OUTPUT:
                    ArrayList<TableSymbole> outputList = visitorOutput((CommonTree) ast.getChild(i));
                    for (TableSymbole ts: outputList) {
                        globalTableSymbole.add(ts);
                    }
                    break;
                default:
                    break;
            }
        }

        return globalTableSymbole;
    }

    public ArrayList<TableSymbole> visitorInput(CommonTree astInput){
        ArrayList<TableSymbole> globalTableSymbole = new ArrayList<>();
        int taille = astInput.getChildCount();
        for (int i = 0; i < taille; i++) {
            TableSymbole inputTS = new TableSymbole();
            inputTS.kind = "parameterInput";
            inputTS.name = astInput.getChild(i).toString();
            inputTS.line = astInput.getChild(i).getLine();
            inputTS.link = null;

            globalTableSymbole.add(inputTS);
        }
        return globalTableSymbole;
    }

    public ArrayList<TableSymbole> visitorOutput(CommonTree astOutput){
        ArrayList<TableSymbole> globalTableSymbole = new ArrayList<>();
        int taille = astOutput.getChildCount();
        for (int i = 0; i < taille; i++) {
            TableSymbole outputTS = new TableSymbole();
            outputTS.kind = "parameterOutput";
            outputTS.name = astOutput.getChild(i).toString();
            outputTS.line = astOutput.getChild(i).getLine();
            outputTS.link = null;

            globalTableSymbole.add(outputTS);
        }
        return globalTableSymbole;
    }

    public ArrayList<TableSymbole> visitorCommandes(CommonTree astCommandes, ArrayList<TableSymbole> comandesTS){
        int taille = astCommandes.getChildCount();
        for (int i = 0; i < taille; i++) {
            switch (astCommandes.getChild(i).getType()) {
                case AFFECTATION:
                    ArrayList<TableSymbole> varLists = visitorAffectation((CommonTree) astCommandes.getChild(i));
                    for (TableSymbole ts: varLists) {
                        comandesTS.add(ts);
                    }
                    break;
                case FOR:
                    TableSymbole tsfor = new TableSymbole();
                    tsfor.name = astCommandes.getChild(i).getText();
                    tsfor.kind = "BOUCLE FOR";
                    tsfor.line = astCommandes.getChild(i).getLine();
                    ArrayList<TableSymbole> blocForTableSymbole = new ArrayList<>();
                    tsfor.link = visitorForOrWhile((CommonTree) astCommandes.getChild(i), "blocBoucleFor");
                    comandesTS.add(tsfor);
                    break;
                case WHILE:
                    TableSymbole tsWhile = new TableSymbole();
                    tsWhile.name = astCommandes.getChild(i).getText();
                    tsWhile.kind = "BOUCLE WHILE";
                    tsWhile.line = astCommandes.getChild(i).getLine();
                    ArrayList<TableSymbole> blocWhileTableSymbole = new ArrayList<>();
                    tsWhile.link = visitorForOrWhile((CommonTree) astCommandes.getChild(i), "blocBoucleWhile");
                    comandesTS.add(tsWhile);
                    break;
                case FOREACH:
                    break;
                case IF:
                    break;
                default:
                    break;
            }
        }
        return comandesTS;
    }

    public ArrayList<TableSymbole> visitorAffectation(CommonTree astAffectation){
        ArrayList<TableSymbole> affectationTS = new ArrayList<>();
        affectationTS = visitorVarList((CommonTree) astAffectation.getChild(0));
        return affectationTS;
    }

    public ArrayList<TableSymbole> visitorVarList(CommonTree astVarList){
        ArrayList<TableSymbole> blocTableSymbole = new ArrayList<>();

        int taille = astVarList.getChildCount();
        for (int i = 0; i < taille; i++) {
            TableSymbole varTS = new TableSymbole();
            varTS.kind = "variable";
            varTS.name = astVarList.getChild(i).getText();
            varTS.line = astVarList.getChild(i).getLine();
            varTS.link = null;
            blocTableSymbole.add(varTS);
        }
        return blocTableSymbole;
    }

    public ArrayList<TableSymbole> visitorForOrWhile(CommonTree astFor, String forOrWhileTS){
        ArrayList<TableSymbole> blocForTableSymbole = new ArrayList<>();
        int taille = astFor.getChildCount();
        for (int i = 0; i < taille; i++) {
            switch (astFor.getChild(i).getType()) {
                case CONDITION:
                    blocForTableSymbole.add(visitorCondition((CommonTree) astFor.getChild(i)));
                    break;
                case COMANDES:
                    TableSymbole tsforComm = new TableSymbole();
                    tsforComm.name = "Bloc";
                    tsforComm.kind = forOrWhileTS;
                    tsforComm.line = astFor.getChild(i).getLine();
                    ArrayList<TableSymbole> blocForCommandeTableSymbole = new ArrayList<>();
                    tsforComm.link = visitorCommandes((CommonTree) astFor.getChild(i), blocForCommandeTableSymbole);
                    blocForTableSymbole.add(tsforComm);
                    break;
                default:
                    break;
            }
        }
        return blocForTableSymbole;
    }



    public TableSymbole visitorCondition(CommonTree astCondition){
        TableSymbole conditionTS = new TableSymbole();
        conditionTS.kind = "condition";
        conditionTS.name = astCondition.getChild(0).getText();
        conditionTS.line = astCondition.getChild(0).getLine();
        conditionTS.link = null;

        return conditionTS;
    }




}
