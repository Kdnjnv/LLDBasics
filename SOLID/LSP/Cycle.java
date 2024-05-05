package SOLID.LSP;

public class Cycle implements Bike{
    private int speed;

    public Cycle() {
        this.speed = 0;
    }

    @Override
    public void turnOnEngine() {
        //this voilates LSP as turnOnEngine can not be implemented.
        throw new AssertionError("there is no engine in Cycle");
    }

    @Override
    public void accelerate() {
        this.speed += 10;
        System.out.println("Cycle new speed: " + this.speed);
    }
}
