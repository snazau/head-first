package com.company.Menu;

import com.company.Iterators.NullIterator;

import java.util.Iterator;

public class MenuItem extends MenuComponent {
    String name;
    String description;
    double price;
    boolean vegetarian;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.vegetarian = vegetarian;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public double getPrice() {
        return price;
    }

    public void print() {
        System.out.print("  " + getName());
        if (isVegetarian()) {
            System.out.print(" (v) ");
        }
        System.out.println(", " + getPrice());
        System.out.println("    -- " + getDescription());
    }

    @Override
    public Iterator<MenuComponent> createIterator() {
        return new NullIterator();
    }
}
