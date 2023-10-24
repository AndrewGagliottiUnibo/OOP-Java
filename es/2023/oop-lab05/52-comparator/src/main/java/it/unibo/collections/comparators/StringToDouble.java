package main.java.it.unibo.collections.comparators;

import java.util.Comparator;

public class StringToDouble implements Comparator<String> {
    
    public int compare(final String o1, final String o2) {
        return Double.compare(Double.parseDouble(o1), Double.parseDouble(o2));
    }
}
