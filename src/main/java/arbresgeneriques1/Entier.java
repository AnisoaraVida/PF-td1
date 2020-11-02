package arbresgeneriques1;

public class Entier implements Sommable<Entier>, Comparable<Entier> {
   public Integer valeur;

   public Entier(int valeur){
       this.valeur = valeur;
   }

   public int valeur(){
       return valeur;
   }

    @Override
    public Entier sommer(Entier autre) {
        return new Entier(this.valeur + autre.valeur);
    }

    private static final Entier _zero = new Entier(0);


    @Override
    public Entier zero() {
        return Entier._zero;
    }

    @Override
    public String toString(){
        return String.format("%d :: Entier", this.valeur);
    }

    @Override
    public int compareTo(Entier entier) {
        return 0;
    }

}
