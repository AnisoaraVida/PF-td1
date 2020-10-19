package arbres;

import java.util.Set;

public class Feuille implements Arbre {
    private final int vals;

    public Feuille(final int vals) {
        this.vals = vals;
    }

    @Override
    public int taille() {
        return 1;
    }

    @Override
    public boolean contient(Integer val) {
        return val.equals(vals);
    }

    @Override
    public Set<Integer> valeurs() {
        return null;
    }

    @Override
    public Integer somme() {
        return null;
    }

    @Override
    public Integer min() {
        return null;
    }

    @Override
    public Integer max() {
        return null;
    }

    @Override
    public boolean estTrie() {
        return false;
    }
}
