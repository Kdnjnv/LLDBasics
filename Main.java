import LLDQuestions.elavatorSystem.*;
import LLDQuestions.elavatorSystem.buttons.ElevatorButton;
import LLDQuestions.elavatorSystem.display.ElevatorDisplay;
import LLDQuestions.elavatorSystem.display.HallDisplay;
import LLDQuestions.elavatorSystem.enums.Direction;
import LLDQuestions.elavatorSystem.enums.DoorState;
import LLDQuestions.elavatorSystem.enums.ElevatorState;
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
        ElevatorPanel elevatorPanel = new ElevatorPanel();
        HallPanel hallPanel = new HallPanel();
        ElevatorDisplay elevatorDisplay = new ElevatorDisplay(15, Direction.DOWN, 1);
        HallDisplay hallDisplay = new HallDisplay(Direction.DOWN, 1);
        ElevatorCar elevatorCar = new ElevatorCar(101, elevatorDisplay, elevatorPanel, new Door(DoorState.CLOSED), ElevatorState.DOWN);
        Floor floor = new Floor(hallDisplay, hallPanel);
        Building building = Building.getInstance();
        building.addElevatorCar(elevatorCar);
        building.addFloor(floor);

        ElevatorSystem elevatorSystem = ElevatorSystem.getInstance();
        elevatorSystem.monitoring();
        elevatorSystem.dispatcher();
    }
}