package LLDQuestions.elavatorSystem;

import com.sun.source.tree.ForLoopTree;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private List<ElevatorCar> elevatorCars;
    private List<Floor> floors;

    Building() {
        this.elevatorCars = new ArrayList<>();
        this.floors = new ArrayList<>();
    }

    private static Building building = null;

    public static Building getInstance() {
        if (building == null) {
            building = new Building();
        }
        return building;
    }

    public void addElevatorCar(ElevatorCar elevatorCar) {
        elevatorCars.add(elevatorCar);
    }

    public void addFloor(Floor floor) {
        floors.add(floor);
    }
}
