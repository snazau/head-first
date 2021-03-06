package com.company.Stores;

import com.company.Pizzas.NYPepperoniPizza;
import com.company.Pizzas.NYSomePizza;
import com.company.Pizzas.Pizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("some")) {
            pizza = new NYSomePizza();
        }
        else if (type.equals("pepperoni")) {
            pizza = new NYPepperoniPizza();
        }

        return pizza;
    }
}
