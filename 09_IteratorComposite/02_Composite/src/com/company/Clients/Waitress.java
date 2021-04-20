package com.company.Clients;

import com.company.Menu.MenuComponent;

import java.util.Iterator;

public class Waitress {
    MenuComponent fullMenu;

    public Waitress(MenuComponent fullMenu) {
        this.fullMenu = fullMenu;
    }

    public void printMenu() {
        fullMenu.print();
    }

    public void printVegetarianMenu() {
        Iterator<MenuComponent> iterator = fullMenu.createIterator();
        System.out.println("\nVEGETARIAN MENU\n----");
        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            try {
                if (menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            }
            catch (UnsupportedOperationException e) {}
        }
    }
}
