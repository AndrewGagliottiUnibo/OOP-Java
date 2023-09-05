package it.unibo.oop.lab05.ex5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.lang.Math;

public final class Utilities {

    private Utilities() {
    }

    //copio aggiungendo alla nuova collezione
    public static <X> void copyAll(final Collection<X> source, final Collection<? super X> target) {
        for(final X element : source) {
            target.add(element);
        }
    }

    //genero un numero random e converto la collezione a lista, poi ritorno un elemento ad un determinato indice
    public static <X> X getRandomElement(final Collection<X> coll) {
        final int randomNumber = (int) (Math.random() * coll.size());
        final List<X> arrList = new ArrayList<>(coll);
        
        return arrList.get(randomNumber);
    }

    public static <X, Y> Pair<X, Y> getRandomPair(final Collection<X> one, final Collection<Y> two) {
        return new Pair<>(getRandomElement(one), getRandomElement(two));
    }
}
