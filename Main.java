import OOPsConcepts.abstraction.Circle;
import OOPsConcepts.encapsulation.Movie;
import OOPsConcepts.inheritance.ElectricCar;
import OOPsConcepts.inheritance.FuelCar;
import OOPsConcepts.inheritance.GasolinCar;
import OOPsConcepts.polymorphism.methodOverloading.Sum;
import OOPsConcepts.polymorphism.methodOverridin.Animal;
import OOPsConcepts.polymorphism.methodOverridin.Lion;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie("Kal ho na ho", 2013, "Comedy");
        System.out.println("Movie name: " + movie.getName() + "year: " + movie.getYear() + "genre: " + movie.getYear());

        Circle circle = new Circle(10);
        System.out.println("Area of circle = " + circle.area() + "\nPerimeter of circle = " + circle.perimeter());

        System.out.println("\nsingle inheritance");
        FuelCar fuelCar = new FuelCar("Honda", "Accord", "Petrol");
        fuelCar.getFuelCar();

        System.out.println("\nHierarchical inheritance");
        ElectricCar electricCar = new ElectricCar("Tesla", "ModelX", "200MWH");
        electricCar.getElectricCar();

        System.out.println("\nMultilevel inheritance");
        GasolinCar gasolinCar = new GasolinCar("Toyota", "corolla" , "Gasline", "30 litres");
        gasolinCar.getGasolinCar();

        System.out.println("\n\nMethod Overriding");
        Animal animal;
        Lion lion = new Lion();
        lion.method1();
        lion.method2();

        System.out.println("\nMethod Overloading");
        Sum sum = new Sum();
        System.out.println("sum of 10 + 20 = " + sum.add(10,20));
        System.out.println("sum of 10 + 20 + 30 = " + sum.add(10,20, 30));
    }
}