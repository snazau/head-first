package Adapters;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorToEnumeratorAdapter implements Enumeration<Object> {
    Iterator<Object> iterator;

    public IteratorToEnumeratorAdapter(Iterator<Object> iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }
}
