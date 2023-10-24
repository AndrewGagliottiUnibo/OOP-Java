package it.unibo.collections.sets;

import java.util.Set;
import java.util.TreeSet;

/**
 * Example class using {@link java.util.Set}.
 *
 */
public final class UseSet {

    private static final int ELEMS = 20;

    private UseSet() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
        /*
         * Considering the content of "UseCollection, write a program which, in
         * order:
         *
         * 1) Builds a TreeSet containing Strings
         */
        Set<String> set = new TreeSet<>();

        /*
         * 2) Populates such Collection with all the Strings representing numbers ranging from "1" to
         * "20" (both included)
         */
        for (int i = 1; i <= ELEMS; i++) {
            set.add(Integer.toString(i));
        }

        /*
         * 3) Prints its content
         */
        System.out.println(set);

        /*
         * 4) Removes all those strings whose represented number is divisible by three.
         * Note: the method removeIf(Predicate) is not allowed.
         */
        var it = set.iterator();

        while(it.hasNext()) {
            var elem = it.next();
            if(Integer.parseInt(elem) % 3 == 0) {
                it.remove();
            }
        }

        /*
         * 5) Prints the content of the Set using a for-each construct
         */
        for(String elem : set) {
            System.out.println(Integer.parseInt(elem));

        }

        /*
         * 6) Verifies whether all the numbers left in the set are even
         */
        var passCondition = true;
        
        for(String elem : set) {
            if(Integer.parseInt(elem) % 2 != 0) {
                System.out.println("Error in finding only even numbers: " + Integer.parseInt(elem));
                passCondition = false;
            }
        }

        System.out.println("All numbers are even? " + passCondition);
    }
}
