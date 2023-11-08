package it.unibo.inner.impl;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import it.unibo.inner.api.IterableWithPolicy;
import it.unibo.inner.api.Predicate;

public class IterableWithPolicyImpl<T> implements IterableWithPolicy<T> {

    private final List<T> elements;

    public IterableWithPolicyImpl(final T[] elements) {
        this.elements = Arrays.asList(elements);
    }

    @Override
    public Iterator<T> iterator() {
        
        return new Iterator<T>() {

            private int current = 0;

            @Override
            public boolean hasNext() {
                if(next() == null) {
                    throw new NoSuchElementException();
                }
                
                return true;
            }

            @Override
            public T next() {
                return elements.get(current++);
            }
        };
    }

    @Override
    public void setIterationPolicy(final Predicate<T> filter) {
        // empty method
    }  
}
