package com.company;

import com.company.Pizzas.Pizza;
import com.company.Stores.ChicagoPizzaStore;
import com.company.Stores.NYPizzaStore;
import com.company.Stores.PizzaStore;

public class Main {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza nyPepperoniPizza = nyPizzaStore.orderPizza("pepperoni");

        System.out.println();

        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        Pizza chicagoPepperoniPizza = chicagoPizzaStore.orderPizza("pepperoni");
    }
}
