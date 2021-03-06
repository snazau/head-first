package com.company.Pizzas;

import com.company.Factories.IngridientFactory;
import com.company.Ingridients.Clams.Clams;

public class ClamPizza extends Pizza {
    IngridientFactory ingridientFactory;

    public ClamPizza(IngridientFactory ingridientFactory) {
        this.name = "Clams Pizza";
        this.ingridientFactory = ingridientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);

        dough = ingridientFactory.createDough();
        sauce = ingridientFactory.createSauce();
        cheese = ingridientFactory.createCheese();
        clams = ingridientFactory.createClams();

        System.out.println("Tossing " + dough.getName());
        System.out.println("Adding " + sauce.getName());
        System.out.println("Adding " + cheese.getName());
        System.out.println("Adding " + clams.getName());
    }
}
