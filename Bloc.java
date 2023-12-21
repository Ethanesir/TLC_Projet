import java.util.List;

public class Bloc extends Secteur{
 
   private Secteur parent;
   
   public Bloc(String nom, List<Symbole> symboles, Secteur parent){
    this.setNom(nom);
    this.setSymboles(symboles);
    this.parent = parent;
   }

}