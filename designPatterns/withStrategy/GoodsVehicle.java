package designPatterns.withStrategy;

import designPatterns.withStrategy.driveStrategy.DriveStrategy;

public class GoodsVehicle extends Vehicle{
    public GoodsVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
