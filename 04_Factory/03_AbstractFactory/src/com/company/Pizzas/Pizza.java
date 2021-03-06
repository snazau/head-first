package com.company.Pizzas;

import com.company.Ingridients.Cheese.Cheese;
import com.company.Ingridients.Clams.Clams;
import com.company.Ingridients.Dough.Dough;
import com.company.Ingridients.Sauces.Sauce;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Clams clams;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizze into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizze in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
