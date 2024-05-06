package OOPsConcepts.inheritance;

//Hierarchical inheritance
public class ElectricCar extends Vehicle{
    private String batteryPower;
    public ElectricCar(String name, String model, String batteryPower) {
        super(name, model);
        this.batteryPower = batteryPower;
    }

    public void getElectricCar() {
        getName();
        System.out.print(", battery power is " + batteryPower);
    }
}
