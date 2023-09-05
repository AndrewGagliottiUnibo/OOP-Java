package it.unibo.oop.lab.nesting2;

import java.util.Iterator;
import java.util.List;

public class OneListAcceptable<T> implements Acceptable<T> {

    private final List<T> list;

    /**
     * 
     * @param list
     */
    public OneListAcceptable(final List<T> list) {
        this.list = list;
    }

    /**
     * @return a new Acceptor
     */
    public Acceptor<T> acceptor() {
        return new Acceptor<T>() {

            //rendo la lista iterabile
            private Iterator<T> listIterator = list.iterator();

            @Override
            public void accept(final T newElement) throws ElementNotAcceptedException {
                if (!listIterator.hasNext() || !listIterator.next().equals(newElement)) {
                    throw new ElementNotAcceptedException(newElement);
                }
            }

            @Override
            public void end() throws EndNotAcceptedException {
                if (listIterator.hasNext()) {
                    throw new EndNotAcceptedException();
                }
            }

        };
    }

}
