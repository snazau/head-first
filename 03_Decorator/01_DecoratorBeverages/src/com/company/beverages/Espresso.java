package com.company.beverages;

public class Espresso extends Beverage {
    public Espresso() {
        this.description = "Delicious Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
