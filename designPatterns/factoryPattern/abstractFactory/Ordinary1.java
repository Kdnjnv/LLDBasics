package designPatterns.factoryPattern.abstractFactory;

public class Ordinary1 implements Vehicle{
    private String name;

    public Ordinary1() {
        this.name = "Ordinary1";
    }

    @Override
    public void average() {
        System.out.println(this.name + " average");
    }
}
