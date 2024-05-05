package designPatterns.withStrategy;

import designPatterns.withStrategy.driveStrategy.DriveStrategy;

public class PassengerVehicle extends Vehicle{
    public PassengerVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
