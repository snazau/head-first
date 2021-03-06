package com.company.Stores;

import com.company.Pizzas.Pizza;

public abstract class PizzaStore {
    public PizzaStore() {}

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    public abstract Pizza createPizza(String type);
}
