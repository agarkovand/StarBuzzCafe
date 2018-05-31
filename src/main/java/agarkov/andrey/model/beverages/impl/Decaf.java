package agarkov.andrey.model.beverages.impl;

import agarkov.andrey.model.beverages.Beverage;

import java.math.BigDecimal;

public class Decaf extends Beverage {

    public Decaf() {
        description = "DeCaf Coffee";
    }

    @Override
    public BigDecimal cost() {

        BigDecimal summ = BigDecimal.ZERO;
        switch (size) {
            case TALL:
                summ = BigDecimal.valueOf(1.05);
                break;
            case GRANDE:
                summ = BigDecimal.valueOf(1.25);
                break;
            case VENTI:
                summ = BigDecimal.valueOf(1.40);
                break;
        }
        return summ;
    }
}
