package designPatterns.factoryPattern.abstractFactory.vehicleAbstractFactory;

public class AbstractVehicleFactory {
    private VehicleFactory vehicleFactory;

    public VehicleFactory getVehicleFactory(String vehicleFactoryType) {
        switch(vehicleFactoryType) {
            case "OrdinaryVehicleFactory":
                return new OrdinaryVehicleFactory();
            case "LuxuaryVehicleFactory":
                return new LuxuaryVehicleFactory();
            default:
                return new OrdinaryVehicleFactory();
        }
    }
}
