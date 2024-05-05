import SOLID.LSP.Bike;
import SOLID.LSP.Cycle;
import SOLID.LSP.MotorBike;
import SOLID.SRP.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MotorBike motorBike = new MotorBike();
        motorBike.accelerate();
        motorBike.turnOnEngine();

        Bike bike1 = new MotorBike();
        bike1.accelerate();
        bike1.turnOnEngine();

        Bike bike2 = new Cycle();
        bike2.accelerate();
        bike2.turnOnEngine();
    }
}