package com.company.Iterators;

import com.company.Menu.MenuComponent;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator<MenuComponent> {
    Stack<Iterator<MenuComponent>> stack = new Stack<>();

    public CompositeIterator(Iterator<MenuComponent> iterator) {  // root iterator
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (stack.empty()) {
            return false;
        }
        else  {
            Iterator<MenuComponent> menuComponentIterator = stack.peek();
            if (!menuComponentIterator.hasNext()) {
                stack.pop();
                return hasNext();
            }
            else {
                return true;
            }
        }
    }

    @Override
    public MenuComponent next() {
        if (hasNext()) {
            Iterator<MenuComponent> menuComponentIterator = stack.peek();
            MenuComponent menuComponent = menuComponentIterator.next();
            stack.push(menuComponent.createIterator());
            return menuComponent;
        }
        else {
            return null;
        }
    }
}
