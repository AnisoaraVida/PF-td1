package arbresgeneriques1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Noeud<T extends Sommable<T> & Arbre<T> & Comparable<T>> implements Arbre<T> {
    private final List<T> fils;

    public Noeud(final List<T> fils) {
        this.fils = fils;
    }

    @Override
    public int taille() {
        int rtr = 0;
        for (final Arbre a : fils) {
            rtr += a.taille();
        }
        return rtr;
    }

    @Override
    public boolean contient(final T val) {
        boolean rtr = false;
        for (final Arbre a : fils) {
            if (a.contient(val)) return true;
        }
        return rtr;
    }

    @Override
    public Set<T> valeurs() {
        Set<T> rtr = new HashSet<>();
        for (final Arbre a : fils) {
            rtr.addAll(a.valeurs());
        }
        return rtr;
    }

    @Override
    public T somme() {
        if (fils == null || fils.size() == 0)
            return null;
        T rtr = fils.get(0).somme();
        for (int i = 1; i< fils.size(); i++) {
            rtr = (T) rtr.sommer(fils.get(i).somme());
        }
        return rtr;
    }

    @Override
    public T min() {
        if (fils == null || fils.size() == 0)
            return null;
        T rtr = fils.get(0).min();
        for (int i = 1; i < fils.size(); i++) {
            T min = fils.get(i).min();
            if(min.compareTo(rtr) == -1) {
                rtr = min;
            }
        }
        return rtr;
    }

    @Override
    public T max() {
        if (fils == null || fils.size() == 0)
            return null;
        T rtr = fils.get(0).max();
        for (int i = 1; i < fils.size(); i++) {
            T max = fils.get(i).max();
            if(max.compareTo(rtr) == 1) {
                rtr = max;
            }
        }
        return rtr;
    }

    @Override
    public boolean estTrie() {
        return false;
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