package agarkov.andrey.model.beverages.impl;

import agarkov.andrey.model.beverages.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
