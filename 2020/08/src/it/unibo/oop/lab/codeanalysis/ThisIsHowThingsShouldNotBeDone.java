package it.unibo.oop.lab.codeanalysis;

import java.util.ArrayList;
import java.util.Collection;

/*
 * Checkstyle complains: the author and version Javadoc tags should not be used.
 * - removed
 */
/**
 * This code triggers static code analyzers. You should use it to see how things
 * SHOULD NOT be done.
 *
 *
 */ 
//* @author Danilo Pianini
//* @version 1.2
public final class ThisIsHowThingsShouldNotBeDone {

    private static final int CICLE_CONDITION = 43;
    private ThisIsHowThingsShouldNotBeDone() {
    }
    /*
     * PMD complains:
     * This class should be final, because it is a utility class (all methods
     * are static)
     * This class should have a private constructor, because is not meant to be
     * extended (it is an utility class)
     * 
     * Checkstyle complains:
     * This class should not have a public or default constructor
     * 
     * - added private constructor
     */

    /*
     * PMD complains:
     * "a" is not final, but it should be
     * This method could use varargs
     * 
     * Checkstyle complains:
     * Missing Javadoc
     * 
     * - added final modifier, added Javadoc
     */
    /**
     * starts of main method.
     * @param a
     */
    public static void main(final String[] a) {
        /*
         * PMD Complains:
         * this variable should be final!
         * 
         * - added final modifier
         */
        final Collection<Object> c = new ArrayList<>();
        /*
         * PMD complains:
         * Use curly braces!
         * 
         * Checkstyle complains:
         * Use curly braces!
         * 
         * What does it mean "43"? It's a magic number!
         * 
         * - added curly braces and costant variable at the beginning
         */
        for (int i = 0; i < CICLE_CONDITION; i++) {
            c.add(new Object());
        }
        /*
         * FindBugs complains
         * Slow: use clear() instead!
         * 
         * - used c.clear() instead
         */
        c.clear();
        //c.removeAll(c);
        
        System.out.println("Cerco di fare stare zitto spotbug dando un senso al main");
    }

}
