package com.company;

import com.company.Pizzas.Pizza;
import com.company.Stores.ChicagoPizzaStore;
import com.company.Stores.NYPizzaStore;
import com.company.Stores.PizzaStore;

public class Main {
    public static void main(String[] args) {
        System.out.println("NY Store");
        PizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza nyCheesePizza = nyPizzaStore.orderPizza("cheese");
        System.out.println();
        Pizza nyClamsPizza = nyPizzaStore.orderPizza("clams");

        System.out.println();
        System.out.println();

        System.out.println("Chicago Store");
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        Pizza chicagoCheesePizza = chicagoPizzaStore.orderPizza("cheese");
        System.out.println();
        Pizza chicagoClamsPizza = chicagoPizzaStore.orderPizza("clams");
    }
}
