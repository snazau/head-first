package com.company.Beverages;

public class Tea extends Beverage {
    @Override
    public void brew() {
        System.out.println("Brewing tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding lemon");
    }
}
