package designPatterns.factoryPattern.abstractFactory.vehicleAbstractFactory;

import designPatterns.factoryPattern.abstractFactory.Luxuary1;
import designPatterns.factoryPattern.abstractFactory.Luxuary2;
import designPatterns.factoryPattern.abstractFactory.Ordinary1;
import designPatterns.factoryPattern.abstractFactory.Vehicle;

public class LuxuaryVehicleFactory implements VehicleFactory{
    @Override
    public Vehicle getVehicle(String vehicleType) {
        switch (vehicleType) {
            case "Luxuary1":
                return new Luxuary1();
            case "Luxuary2":
                return new Luxuary2();
            default:
                return new Ordinary1();
        }
    }
}
