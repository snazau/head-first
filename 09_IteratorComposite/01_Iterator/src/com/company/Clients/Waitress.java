package com.company.Clients;

import com.company.Menus.Menu;
import com.company.Menus.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {
    ArrayList<Menu> menus;

    public Waitress(ArrayList<Menu> menus) {
        this.menus = menus;
    }

    public void printMenu() {
        Iterator<Menu> menusIterator = menus.iterator();
        while (menusIterator.hasNext()) {
            Menu menu = menusIterator.next();
            Iterator<MenuItem> menuIterator = menu.createIterator();
            printMenu(menuIterator);
        }
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
