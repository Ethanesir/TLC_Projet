import java.util.List;

public abstract class Secteur{
   private String nom;
   private List<Symbole> symboles;

   public String getNom(){
    return this.nom;
   }

   public List<Symbole> getSymbole() {
    return this.symboles;
   }

   public void setNom(String nom) {
    this.nom = nom;
   }

   public void setSymboles(List<Symbole> symboles) {
    this.symboles = symboles;
   }
   
   public void addSymbole(Symbole s){
       symboles.add(s);
   }
}
