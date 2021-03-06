package com.company.Stores;

import com.company.Pizzas.ChicagoPepperoniPizza;
import com.company.Pizzas.ChicagoSomePizza;
import com.company.Pizzas.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("some")) {
            pizza = new ChicagoSomePizza();
        }
        else if (type.equals("pepperoni")) {
            pizza = new ChicagoPepperoniPizza();
        }

        return pizza;
    }
}
