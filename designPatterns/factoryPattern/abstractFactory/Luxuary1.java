package designPatterns.factoryPattern.abstractFactory;

public class Luxuary1 implements Vehicle{
    private String name;

    public Luxuary1() {
        this.name = "Luxuary1";
    }

    @Override
    public void average() {
        System.out.println(this.name + " average");
    }
}
