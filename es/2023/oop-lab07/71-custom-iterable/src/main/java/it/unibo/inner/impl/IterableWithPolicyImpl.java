package it.unibo.inner.impl;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import it.unibo.inner.api.IterableWithPolicy;
import it.unibo.inner.api.Predicate;

public class IterableWithPolicyImpl<T> implements IterableWithPolicy<T> {

    private final List<T> elements;

    /**
     * Iterates over all the elements. Default version.
     * @param elements the elements to iterate.
     */
    public IterableWithPolicyImpl(final T[] elements) {
        this.elements = List.of(elements);
    }

    @Override
    public Iterator<T> iterator() {
        
        return new Iterator<T>() {

            private int current = 0;

            @Override
            public boolean hasNext() {
                while (current < elements.size()) {
                    return true;
                }
                return false;
            }

            @Override
            public T next() {
                if (hasNext()) {
                    return elements.get(current++);
                }

                throw new NoSuchElementException();
            }
        };
    }

    @Override
    public void setIterationPolicy(final Predicate<T> filter) {
        // empty method
    }  
}
