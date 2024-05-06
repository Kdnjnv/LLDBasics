package OOPsConcepts.inheritance;

//single inheritance
public class FuelCar extends Vehicle{
    private String cusbustType;

    public FuelCar(String name, String model, String cusbustType) {
        super(name, model);
        this.cusbustType = cusbustType;
    }

    public void getFuelCar() {
        getName();
        System.out.print(", combust type is " + cusbustType);
    }
}
