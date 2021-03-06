package com.company.Factories;

import com.company.Ingridients.Cheese.Cheese;
import com.company.Ingridients.Cheese.ReggianoCheese;
import com.company.Ingridients.Clams.Clams;
import com.company.Ingridients.Clams.FreshClams;
import com.company.Ingridients.Dough.Dough;
import com.company.Ingridients.Dough.ThinCrustDough;
import com.company.Ingridients.Sauces.MarinaraSauce;
import com.company.Ingridients.Sauces.Sauce;

public class NYIngridientFactory implements IngridientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
