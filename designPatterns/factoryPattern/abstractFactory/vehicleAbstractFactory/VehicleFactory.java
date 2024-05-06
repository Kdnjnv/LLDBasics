package designPatterns.factoryPattern.abstractFactory.vehicleAbstractFactory;

import designPatterns.factoryPattern.abstractFactory.Vehicle;

public interface VehicleFactory {
    Vehicle getVehicle(String vehicleType);
}
