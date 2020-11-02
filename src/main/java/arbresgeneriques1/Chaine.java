package arbresgeneriques1;

public class Chaine implements Sommable<Chaine>, Comparable<Chaine> {
    public String valeur;

    public Chaine(String valeur){
        this.valeur = valeur;
    }

    public String valeur(){
        return valeur;
    }

    @Override
    public Chaine sommer(Chaine autre) {
        return new Chaine(String.format("%s%s", this.valeur, autre.valeur()));
    }

    private static final Chaine _zero = new Chaine("");

    @Override
    public Chaine zero() {
        return Chaine._zero;
    }

    @Override
    public String toString(){
        return String.format("%s :: Chaine", this.valeur());
    }


    @Override
    public int compareTo(Chaine chaine) {
        return 0;
    }
}
