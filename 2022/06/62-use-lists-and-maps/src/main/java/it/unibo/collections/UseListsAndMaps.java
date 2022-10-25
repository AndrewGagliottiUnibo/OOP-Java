package it.unibo.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Example class using {@link List} and {@link Map}.
 *
 */
public final class UseListsAndMaps {

    private static final int GAP = 1000;
    private static final int ELEMS = 100_000;
    private static final long AFRICA_POPULATION = 1_110_635_000L;
    private static final long AMERICAS_POPULATION = 972_005_000L;
    private static final long ANTARCTICA_POPULATION = 0L;
    private static final long ASIA_POPULATION = 4_298_723_000L;
    private static final long EUROPE_POPULATION = 742_452_000L;
    private static final long OCEANIA_POPULATION = 38_304_000L;

    private UseListsAndMaps() {
    }

    /**
     * @param s
     *          unused
     */
    public static void main(final String... s) {
        /*
         * 1) Create a new ArrayList<Integer>, and populate it with the numbers
         * from 1000 (included) to 2000 (excluded).
         */
        List<Integer> aList = new ArrayList<>();
        for (int i = 0; i < GAP; i++) {
            aList.add(i + GAP);
        }
        System.out.println(aList);

        /*
         * 2) Create a new LinkedList<Integer> and, in a single line of code
         * without using any looping construct (for, while), populate it with
         * the same contents of the list of point 1.
         */
        List<Integer> lList = Collections.unmodifiableList(aList);
        System.out.println("\n\n" + lList);

        /*
         * 3) Using "set" and "get" and "size" methods, swap the first and last
         * element of the first list. You can not use any "magic number".
         * (Suggestion: use a temporary variable)
         */
        var temp = aList.get(aList.size() - 1);
        aList.set(aList.size() - 1, aList.get(0));
        aList.set(0, temp);

        /*
         * 4) Using a single for-each, print the contents of the arraylist.
         */
        for (Integer elem : aList) {
            System.out.println(elem);
        }
        /*
         * 5) Measure the performance of inserting new elements in the head of
         * the collection: measure the time required to add 100.000 elements as
         * first element of the collection for both ArrayList and LinkedList,
         * using the previous lists. In order to measure times, use as example
         * TestPerformance.java.
         */
        long timeArray = System.nanoTime();
        for (int i = 1; i <= ELEMS; i++) {
            aList.add(0, i);
        }
        timeArray = System.nanoTime() - timeArray;
        final var millisArray = TimeUnit.NANOSECONDS.toMillis(timeArray);
        System.out.println(// NOPMD
                "Inserting "
                        + ELEMS
                        + " elements in the head of array listtook "
                        + timeArray
                        + "ns ("
                        + millisArray
                        + "ms)");

        long timeLinked = System.nanoTime();
        for (int i = 1; i <= ELEMS; i++) {
            aList.add(0, i);
        }
        timeLinked = System.nanoTime() - timeLinked;
        final var millisLinked = TimeUnit.NANOSECONDS.toMillis(timeLinked);
        System.out.println(// NOPMD
                "Inserting "
                        + ELEMS
                        + " elements in the head of linked list took "
                        + timeLinked
                        + "ns ("
                        + millisLinked
                        + "ms)");
        /*
         * 6) Measure the performance of reading 1000 times an element whose
         * position is in the middle of the collection for both ArrayList and
         * LinkedList, using the collections of point 5. In order to measure
         * times, use as example PerfTest.java.
         */
        long time = System.nanoTime();
        for (int i = 0; i < GAP; i++) {
            aList.get(aList.size() / 2);
        }
        time = System.nanoTime() - time;
        System.out.println(
                "Reading " + GAP + " elements in the middle of an ArrayList took " + time);
        time = System.nanoTime();
        for (int i = 0; i < GAP; i++) {
            lList.get(lList.size() / 2);
        }
        time = System.nanoTime() - time;
        System.out.println(
                "Reading " + GAP + " elements in the middle of a LinkedList took " + time);

        /*
         * 7) Build a new Map that associates to each continent's name its
         * population:
         *
         * Africa -> 1,110,635,000
         *
         * Americas -> 972,005,000
         *
         * Antarctica -> 0
         *
         * Asia -> 4,298,723,000
         *
         * Europe -> 742,452,000
         *
         * Oceania -> 38,304,000
         */
        final Map<String, Long> world = new HashMap<>();
        world.put("Africa", AFRICA_POPULATION);
        world.put("Americas", AMERICAS_POPULATION);
        world.put("Antarctica", ANTARCTICA_POPULATION);
        world.put("Asia", ASIA_POPULATION);
        world.put("Europe", EUROPE_POPULATION);
        world.put("Oceania", OCEANIA_POPULATION);

        /*
         * 8) Compute the population of the world
         */
        long worldPopulation = 0;
        for (final long population : world.values()) {
            worldPopulation += population;
        }
        System.out.println(
                "We are ~" + worldPopulation
                        + " humans beings on this pale blue dot (just enough to overflow integers :D).");
    }
}
