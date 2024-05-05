package designPatterns.decoratorPattern.Decorator;

import designPatterns.decoratorPattern.Base.BasePizza;

public class ExtraCheese extends Toppings{
    private BasePizza basePizza;
    private int extraCheeseCost;

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
        extraCheeseCost = 10;
    }

    @Override
    public int cost() {
        return basePizza.cost() + extraCheeseCost;
    }
}
