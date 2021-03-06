package com.company.Pizzas;

import com.company.Factories.IngridientFactory;

public class CheesePizza extends Pizza {
    IngridientFactory ingridientFactory;

    public CheesePizza(IngridientFactory ingridientFactory) {
        this.name = "Cheese Pizza";
        this.ingridientFactory = ingridientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);

        dough = ingridientFactory.createDough();
        sauce = ingridientFactory.createSauce();
        cheese = ingridientFactory.createCheese();

        System.out.println("Tossing " + dough.getName());
        System.out.println("Adding " + sauce.getName());
        System.out.println("Adding " + cheese.getName());
    }
}
