package com.company.beverages;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        this.description = "Delicious DarkRoast";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
