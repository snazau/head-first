package com.company.Factories;

import com.company.Ingridients.Cheese.Cheese;
import com.company.Ingridients.Cheese.MozzarellaCheese;
import com.company.Ingridients.Clams.Clams;
import com.company.Ingridients.Clams.FreshClams;
import com.company.Ingridients.Dough.Dough;
import com.company.Ingridients.Dough.ThickCrustDough;
import com.company.Ingridients.Sauces.PlumTomatoSauce;
import com.company.Ingridients.Sauces.Sauce;

public class ChicagoIngridientFactory implements IngridientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
