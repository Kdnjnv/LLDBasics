import designPatterns.decoratorPattern.Base.BasePizza;
import designPatterns.decoratorPattern.Base.Farmhouse;
import designPatterns.decoratorPattern.Base.VegDelight;
import designPatterns.decoratorPattern.Decorator.ExtraCheese;
import designPatterns.decoratorPattern.Decorator.Mushroom;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BasePizza farmhouse = new Farmhouse();
        System.out.println(farmhouse.cost());

        BasePizza farmhouseWithCheese = new ExtraCheese(farmhouse);
        System.out.println(farmhouseWithCheese.cost());

        BasePizza vegDelight = new ExtraCheese(new Mushroom(new VegDelight()));
        System.out.println(vegDelight.cost());
    }
}