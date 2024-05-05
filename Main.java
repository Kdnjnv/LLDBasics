import designPatterns.withStrategy.PassengerVehicle;
import designPatterns.withStrategy.SportsVehicle;
import designPatterns.withStrategy.Vehicle;
import designPatterns.withStrategy.driveStrategy.DriveStrategy;
import designPatterns.withStrategy.driveStrategy.NormalDriveStrategy;
import designPatterns.withStrategy.driveStrategy.SpecialDriveStrategy;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        DriveStrategy normalDriveStrategy = new NormalDriveStrategy();
        DriveStrategy specialDriveStrategy = new SpecialDriveStrategy();

        Vehicle sportsVehicle = new SportsVehicle(specialDriveStrategy);
        Vehicle passengerVehicle = new PassengerVehicle(normalDriveStrategy);

        sportsVehicle.drive();
        passengerVehicle.drive();
    }
}