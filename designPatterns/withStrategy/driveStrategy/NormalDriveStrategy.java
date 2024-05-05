package designPatterns.withStrategy.driveStrategy;

public class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Normal drive strategy");
    }
}
