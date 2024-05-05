package designPatterns.strategyPattern.withStrategy;

import designPatterns.strategyPattern.withStrategy.driveStrategy.DriveStrategy;

public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
