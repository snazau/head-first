package com.company.Stores;

import com.company.Factories.IngridientFactory;
import com.company.Factories.NYIngridientFactory;
import com.company.Pizzas.CheesePizza;
import com.company.Pizzas.ClamPizza;
import com.company.Pizzas.Pizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        IngridientFactory ingridientFactory = new NYIngridientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingridientFactory);
        }
        else if (type.equals("clams")) {
            pizza = new ClamPizza(ingridientFactory);
        }

        return pizza;
    }
}
