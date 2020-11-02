package arbresgeneriques;

import arbresgeneriques.Arbre;

import java.util.Set;

public class Feuille<T> implements Arbre<T> {
    private final T vals;

    public Feuille(final T vals) {
        this.vals = vals;
    }

    @Override
    public int taille() {
        return 1;
    }

    @Override
    public boolean contient( final T val) {
        return val.equals(vals); // ou this.vals == val;
    }

    @Override
    public Set<T> valeurs() {
        return Set.of(this.vals);
        // ou Set<Integer> rtr = new HashSet<>();
        // rtr.add(this.vals);
        // return rtr;

    }




}

