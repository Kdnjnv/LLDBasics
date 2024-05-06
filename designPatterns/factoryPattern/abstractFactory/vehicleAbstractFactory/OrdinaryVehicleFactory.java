package designPatterns.factoryPattern.abstractFactory.vehicleAbstractFactory;

import designPatterns.factoryPattern.abstractFactory.Ordinary1;
import designPatterns.factoryPattern.abstractFactory.Ordinary2;
import designPatterns.factoryPattern.abstractFactory.Vehicle;

public class OrdinaryVehicleFactory implements VehicleFactory{

    @Override
    public Vehicle getVehicle(String vehicleType) {
        switch(vehicleType) {
            case "Ordinary1":
                return new Ordinary1();
            case "Ordinary2":
                return new Ordinary2();
            default:
                return new Ordinary1();
        }
    }
}
