package com.company;

import com.company.Pizzas.PepperoniPizza;
import com.company.Pizzas.Pizza;
import com.company.Pizzas.SomePizza;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("some")) {
            pizza = new SomePizza();
        }
        else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        }

        return pizza;
    }
}
