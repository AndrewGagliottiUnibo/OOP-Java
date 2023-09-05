package it.unibo.oop.lab05.ex5;

public final class Pair<X, Y> {

    private final X first;
    private final Y second;

    public Pair(final X o1, final Y o2) {
        this.first = o1;
        this.second = o2;
    }

    public X getFirst() {
        return this.first;
    }

    public Y getSecond() {
        return this.second;
    }

    public String toString() {
        return "Pair [first=" + first + ", second=" + second + "]";
    }

    public int hashCode() {
        /*
         * Xor of hashes. It is usually a decent hashing method, and it is
         * easier to understand than the auto-generated hashCode() by Eclipse.
         * However, for serious use cases, a good hashing library and algorithm is
         * warmly recommended. For instance, Google Guava provides a number of
         * good and fast hashing algorithms (Murmur 3 is an extremely good
         * solution).
         */
        return first.hashCode() ^ second.hashCode();
    }

    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Pair) {
            final var p = (Pair<?, ?>) obj;
            return areEquals(first, p.first) && areEquals(second, p.second);
        }
        return false;
    }

    private static boolean areEquals(final Object o1, final Object o2) {
        return o1 == null ? o2 == null : o1.equals(o2);
    }

}
