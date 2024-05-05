package designPatterns.strategyPattern.withStrategy;

import designPatterns.strategyPattern.withStrategy.driveStrategy.DriveStrategy;

public class SportsVehicle extends Vehicle{
    private DriveStrategy driveStrategy;

    public SportsVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
