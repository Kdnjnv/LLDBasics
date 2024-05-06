import designPatterns.factoryPattern.abstractFactory.Vehicle;
import designPatterns.factoryPattern.abstractFactory.vehicleAbstractFactory.AbstractVehicleFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        ShapeFactory shapeFactory = new ShapeFactory();
//
//        Shape circle = shapeFactory.getShape("Circle");
//        Shape square = shapeFactory.getShape("Square");
//
//        circle.draw();
//        square.draw();

        Vehicle ordinaryVehicle = new AbstractVehicleFactory().getVehicleFactory("OrdinaryVehicleFactory").getVehicle("Ordinary1");
        ordinaryVehicle.average();
        Vehicle luxuryVehicle = new AbstractVehicleFactory().getVehicleFactory("LuxuaryVehicleFactory").getVehicle("Luxuary1");
        luxuryVehicle.average();
    }
}