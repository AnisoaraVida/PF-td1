package arbresgeneriques1;

import java.util.Set;

public class Feuille<T extends Sommable<T> & Comparable<T>> implements Arbre<T> {
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

    @Override
    public T somme() {
        return this.vals;
    }

    @Override
    public T min() {
        return this.vals;
    }

    @Override
    public T max() {
        return this.vals;
    }

    @Override
    public boolean estTrie() {
        return true;
    }


    @Override
    public T sommer(T autre) {
        return null;
    }

    @Override
    public T zero() {
        return null;
    }


    @Override
    public int compareTo(T t) {
        return 0;
    }
}
