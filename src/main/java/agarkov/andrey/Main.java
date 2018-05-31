package agarkov.andrey;

import agarkov.andrey.model.beverages.Beverage;
import agarkov.andrey.model.beverages.impl.Espresso;
import agarkov.andrey.model.beverages.impl.HouseBlend;
import agarkov.andrey.model.condiments.impl.Mocha;
import agarkov.andrey.model.condiments.impl.Soy;
import agarkov.andrey.model.condiments.impl.Whip;

public class Main {

    public static void main(String[] args) {

        Beverage beverage1 = new Espresso();
        beverage1.setSize(Beverage.Size.GRANDE);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2.setSize(Beverage.Size.VENTI);
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);

        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}
