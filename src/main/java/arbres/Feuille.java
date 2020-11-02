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
        return val.equals(vals); // ou this.vals == val;
    }

    @Override
    public Set<Integer> valeurs() {
        return Set.of(this.vals);
        // ou Set<Integer> rtr = new HashSet<>();
        // rtr.add(this.vals);
        // return rtr;

    }

    @Override
    public Integer somme() {
        return this.vals;
    }

    @Override
    public Integer min() {
        return this.vals;
    }

    @Override
    public Integer max() {
        return this.vals;
    }

    @Override
    public boolean estTrie() {
        return true;
    }
}
