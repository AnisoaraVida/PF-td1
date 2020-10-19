package arbres;

import javax.naming.PartialResultException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Noeud implements Arbre{
    public final List<Arbre> fils;

    public Noeud() {
        this.fils = new ArrayList<>();
    }

    @Override
    public int taille() {
        int rtr = 0;
        for(final Arbre a : fils){
            rtr += a.taille();
        }
        return rtr;
    }

    @Override
    public boolean contient(Integer val) {
        boolean rtr = false;
        for(final Arbre a : fils){
            if (a.equals(fils)) return true;
        }
        return rtr;
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
