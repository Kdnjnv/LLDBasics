package designPatterns.factoryPattern.abstractFactory;

public class Luxuary2 implements Vehicle{
    private String name;

    public Luxuary2() {
        this.name = "Luxuary2";
    }

    @Override
    public void average() {
        System.out.println(this.name + " average");
    }
}
