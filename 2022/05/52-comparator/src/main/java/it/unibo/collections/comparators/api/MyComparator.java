package it.unibo.collections.comparators.api;

import java.util.Comparator;

public class MyComparator implements Comparator<String> {

    // I searched on the Javadoc for comparing double
    @Override
    public int compare(String o1, String o2) {
        return Double.compare(Double.parseDouble(o1), Double.parseDouble(o2));
    }
}
