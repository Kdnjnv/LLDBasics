package SOLID.LSP;

public class MotorBike implements Bike{
    private boolean isEngineOn;
    private int speed;

    public MotorBike() {
        this.isEngineOn = false;
        this.speed = 0;
    }

    @Override
    public void turnOnEngine() {
        isEngineOn = true;
        System.out.println("MotorBike engine turned on");
    }

    @Override
    public void accelerate() {
        this.speed += 10;
        System.out.println("MotorBike New speed: " + this.speed);
    }
}
