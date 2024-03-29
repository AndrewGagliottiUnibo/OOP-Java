package it.unibo.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Example class using {@link List} and {@link Map}.
 *
 */
public final class UseListsAndMaps {

    private static final int MAX_VALUE = 1000;
    private static final int FILL_VALUE = 100000;
    private static final int READ_VALUE = 10_000;
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
     *            unused
     */
    public static void main(final String... s) {
        /*
         * 1) Create a new ArrayList<Integer>, and populate it with the numbers
         * from 1000 (included) to 2000 (excluded).
         */
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < MAX_VALUE; i++) {
            list.add(i + MAX_VALUE);
        }

        System.out.println(list);
        /*
         * 2) Create a new LinkedList<Integer> and, in a single line of code
         * without using any looping construct (for, while), populate it with
         * the same contents of the list of point 1.
         */
        List<Integer> list2 = new LinkedList<>(list);
        System.out.println(list2);

        /*
         * 3) Using "set" and "get" and "size" methods, swap the first and last
         * element of the first list. You can not use any "magic number".
         * (Suggestion: use a temporary variable)
         */
        final int temp = list.get(0);
        list.set(0, list.get(list.size() - 1));
        list.set(list.size() - 1, temp);

        System.out.println(list);
        System.out.println(list2);

        /*
         * 4) Using a single for-each, print the contents of the arraylist.
         */
        list.forEach(System.out::println);
        
        /*
         * 5) Measure the performance of inserting new elements in the head of
         * the collection: measure the time required to add 100.000 elements as
         * first element of the collection for both ArrayList and LinkedList,
         * using the previous lists. In order to measure times, use as example
         * TestPerformance.java.
         */
        // for the ArrayList
        long time = System.nanoTime();

        for (int i = 1; i <= FILL_VALUE; i++) {
            list.add(0, i);
        }

        time = System.nanoTime() - time;
        var millis = TimeUnit.NANOSECONDS.toMillis(time);
        System.out.println(// NOPMD
            "Converting "
                + list.size()
                + " ints to String and inserting them in a ArrayList took "
                + time
                + "ns ("
                + millis
                + "ms)"
        );

        // for the LinkedList
        time = System.nanoTime();

        for (int i = 1; i <= FILL_VALUE; i++) {
            list2.add(0, i);
        }

        time = System.nanoTime() - time;
        millis = TimeUnit.NANOSECONDS.toMillis(time);
        System.out.println(// NOPMD
            "Converting "
                + list.size()
                + " ints to String and inserting them in a LinkedList took "
                + time
                + "ns ("
                + millis
                + "ms)"
        );

        /*
         * 6) Measure the performance of reading 1000 times an element whose
         * position is in the middle of the collection for both ArrayList and
         * LinkedList, using the collections of point 5. In order to measure
         * times, use as example TestPerformance.java.
         */
        time = System.nanoTime();

        for (int i = 0; i < READ_VALUE; i++) {
            list.get(list.size() / 2);
        }

        time = System.nanoTime() - time;
        millis = TimeUnit.NANOSECONDS.toMillis(time);
        System.out.println(
            "Reading " + READ_VALUE 
            + " elements in the middle of an ArrayList took " 
            + time
            + "ns ("
            + millis
            + "ms)"
        );

        time = System.nanoTime();

        for (int i = 0; i < READ_VALUE; i++) {
            list2.get(list2.size() / 2);
        }
        
        time = System.nanoTime() - time;
        millis = TimeUnit.NANOSECONDS.toMillis(time);
        System.out.println(
            "Reading " + READ_VALUE 
            + " elements in the middle of an LinkedList took " 
            + time
            + "ns ("
            + millis
            + "ms)"
        );

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
        world.put("America", AMERICAS_POPULATION);
        world.put("Antarctica", ANTARCTICA_POPULATION);
        world.put("Asia", ASIA_POPULATION);
        world.put("Europe", EUROPE_POPULATION);
        world.put("Oceania", OCEANIA_POPULATION);

        /*
         * 8) Compute the population of the world
         */
        long population = 0;
        // ritorna un set di valori da poter iterare
        for (final long p : world.values()) {
            population += p;
        }
        System.out.println(
            "We are ~" + population + " people."
        );
    }
}
