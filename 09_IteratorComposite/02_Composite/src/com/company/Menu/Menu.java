package com.company.Menu;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {
    String name;
    String description;
    ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("---------------------");

        Iterator<MenuComponent> menuComponentIterator = menuComponents.iterator();
        while (menuComponentIterator.hasNext()) {
            MenuComponent menuComponent =  menuComponentIterator.next();
            menuComponent.print();
        }
    }
}
