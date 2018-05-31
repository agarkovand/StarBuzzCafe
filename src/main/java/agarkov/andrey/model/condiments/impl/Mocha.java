package agarkov.andrey.model.condiments.impl;

import agarkov.andrey.model.beverages.Beverage;
import agarkov.andrey.model.condiments.CondimentDecorator;

import java.math.BigDecimal;

public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public BigDecimal cost() {

        BigDecimal condimentCost = BigDecimal.ZERO;

        switch (size) {
            case TALL:
                condimentCost = BigDecimal.valueOf(.20);
                break;
            case VENTI:
                condimentCost = BigDecimal.valueOf(.25);
                break;
            case GRANDE:
                condimentCost = BigDecimal.valueOf(.30);
                break;
        }

        return beverage.cost().add(condimentCost);
    }
}
