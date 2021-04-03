package Adapters;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationToIteratorAdapter implements Iterator<Object> {
    Enumeration<?> enumeration;

    public EnumerationToIteratorAdapter(Enumeration<?> enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
