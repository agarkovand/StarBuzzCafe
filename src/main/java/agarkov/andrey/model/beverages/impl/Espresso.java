package agarkov.andrey.model.beverages.impl;

import agarkov.andrey.model.beverages.Beverage;

import java.math.BigDecimal;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public BigDecimal cost() {

        BigDecimal summ = BigDecimal.ZERO;
        switch (size) {
            case TALL:
                summ = BigDecimal.valueOf(0.99);
                break;
            case GRANDE:
                summ = BigDecimal.valueOf(1.14);
                break;
            case VENTI:
                summ = BigDecimal.valueOf(1.29);
                break;
        }
        return summ;
    }
}
