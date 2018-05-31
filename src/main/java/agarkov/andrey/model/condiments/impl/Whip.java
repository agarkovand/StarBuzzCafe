package agarkov.andrey.model.condiments.impl;

import agarkov.andrey.model.beverages.Beverage;
import agarkov.andrey.model.condiments.CondimentDecorator;

import java.math.BigDecimal;

public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public BigDecimal cost() {

        BigDecimal condimentCost = BigDecimal.ZERO;

        switch (size) {
            case TALL:
                condimentCost = BigDecimal.valueOf(.10);
                break;
            case VENTI:
                condimentCost = BigDecimal.valueOf(.13);
                break;
            case GRANDE:
                condimentCost = BigDecimal.valueOf(.15);
                break;
        }

        return beverage.cost().add(condimentCost);
    }
}
