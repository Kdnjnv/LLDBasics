package designPatterns.strategyPattern.withStrategy;

import designPatterns.strategyPattern.withStrategy.driveStrategy.DriveStrategy;

public class GoodsVehicle extends Vehicle{
    public GoodsVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
