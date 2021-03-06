package com.company;

import com.company.Pizzas.Pizza;

public class Main {
    public static void main(String[] args) {
        SimplePizzaFactory pizzaFactory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(pizzaFactory);

        Pizza somePizza = pizzaStore.orderPizza("some");
        System.out.println();
        Pizza pepperoniPizza = pizzaStore.orderPizza("pepperoni");
    }
}
