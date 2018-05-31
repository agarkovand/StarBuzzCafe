package agarkov.andrey.model.beverages.impl;

import agarkov.andrey.model.beverages.Beverage;

public class Decaf extends Beverage {

    public Decaf() {
        description = "DeCaf Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
