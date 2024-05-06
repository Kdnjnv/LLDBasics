package designPatterns.factoryPattern.abstractFactory;

public class Ordinary2 implements Vehicle{
    private String name;

    public Ordinary2() {
        this.name = "Ordinary2";
    }

    @Override
    public void average() {
        System.out.println(this.name + " average");
    }
}
