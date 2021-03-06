package com.company.Factories;

import com.company.Ingridients.Cheese.Cheese;
import com.company.Ingridients.Clams.Clams;
import com.company.Ingridients.Dough.Dough;
import com.company.Ingridients.Sauces.Sauce;

public interface IngridientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Clams createClams();
}
