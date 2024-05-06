package OOPsConcepts.inheritance;

//Multilevel inheritance
public class GasolinCar extends FuelCar{
    private String gasCapacity;
    public GasolinCar(String name, String model, String cusbustType, String gasCapacity) {
        super(name, model, cusbustType);
        this.gasCapacity = gasCapacity;
    }

    public void getGasolinCar() {
        getFuelCar();
        System.out.print(", gas capacity is " + gasCapacity);
    }
}
