package agarkov.andrey.model.beverages.impl;

import agarkov.andrey.model.beverages.Beverage;

import java.math.BigDecimal;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public BigDecimal cost() {

        BigDecimal summ = BigDecimal.ZERO;
        switch (size) {
            case TALL:
                summ = BigDecimal.valueOf(0.89);
                break;
            case GRANDE:
                summ = BigDecimal.valueOf(1.09);
                break;
            case VENTI:
                summ = BigDecimal.valueOf(1.24);
                break;
        }
        return summ;
    }
}
