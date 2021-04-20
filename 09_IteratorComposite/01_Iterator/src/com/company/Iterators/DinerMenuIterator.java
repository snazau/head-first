package com.company.Iterators;

import com.company.Menus.MenuItem;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {
    MenuItem[] menuItems;
    int pointer = 0;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (pointer >= menuItems.length || menuItems[pointer] == null) {
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItems[pointer];
        pointer++;
        return menuItem;
    }

    @Override
    public void remove() {
        if (pointer <= 0) {
            throw new IllegalStateException("You can't remove an item until you've done at least one next()");
        }
        if (menuItems[pointer - 1] != null) {
            for (int i = pointer - 1; i < menuItems.length - 1; ++i) {
                menuItems[i] = menuItems[i + 1];
            }
            menuItems[menuItems.length - 1] = null;
        }
    }
}
