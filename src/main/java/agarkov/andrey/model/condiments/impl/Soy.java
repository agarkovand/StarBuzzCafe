package agarkov.andrey.model.condiments.impl;

import agarkov.andrey.model.beverages.Beverage;
import agarkov.andrey.model.condiments.CondimentDecorator;

import java.math.BigDecimal;

public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public BigDecimal cost() {

        BigDecimal condimentCost = BigDecimal.ZERO;

        switch (size) {
            case TALL:
                condimentCost = BigDecimal.valueOf(.15);
                break;
            case VENTI:
                condimentCost = BigDecimal.valueOf(.20);
                break;
            case GRANDE:
                condimentCost = BigDecimal.valueOf(.25);
                break;
        }

        return beverage.cost().add(condimentCost);
    }
}
