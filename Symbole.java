public class Symbole{

   private Etat etat;
   private String nom;
   private int ligne;
   private String type;

   public Symbole(Etat etat, String nom, int ligne, String type){
       this.etat=etat;
       this.nom=nom;
       this.ligne=ligne;
       this.type=type;
   }

   public Etat getEtat(){
       return this.etat;
   }
   public String getNom(){
       return this.nom;
   }
   public int getLigne(){
       return this.ligne;
   }
   public String getType(){
       return this.type;
   }
}
