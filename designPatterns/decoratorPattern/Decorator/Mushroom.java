package designPatterns.decoratorPattern.Decorator;

import designPatterns.decoratorPattern.Base.BasePizza;

public class Mushroom extends Toppings{
    private BasePizza basePizza;
    private int mushroomCost;

    public Mushroom(BasePizza basePizza) {
        this.basePizza = basePizza;
        this.mushroomCost = 20;
    }

    @Override
    public int cost() {
        return basePizza.cost() + this.mushroomCost;
    }
}
