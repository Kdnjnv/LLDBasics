import SOLID.DI.*;
import designPatterns.withoutStrategy.PassengerVehicle;
import designPatterns.withoutStrategy.SportsVehicle;
import designPatterns.withoutStrategy.Vehicle;


import javax.crypto.Mac;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Vehicle sportsVehicle = new SportsVehicle();
        Vehicle passengerVehicle = new PassengerVehicle();

        sportsVehicle.drive();
        passengerVehicle.drive();

    }
}