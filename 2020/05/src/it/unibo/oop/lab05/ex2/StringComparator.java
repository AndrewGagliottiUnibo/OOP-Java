package it.unibo.oop.lab05.ex2;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {

    /**
     *  a quanto credo di aver capito una volta che io aggiungo un elemento questo viene
     *  confrontato prima di essere aggiunto al TreeSet.
     *  
     *  @param o1
     *  @param o2
     *  @return correct order
     */
    public int compare(final String o1,final String o2) {
        return Double.compare(Double.parseDouble(o1), Double.parseDouble(o2));
    }
}
