package designPatterns.strategyPattern.withStrategy;

import designPatterns.strategyPattern.withStrategy.driveStrategy.DriveStrategy;

public class PassengerVehicle extends Vehicle{
    public PassengerVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
