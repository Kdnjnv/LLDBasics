package LLDQuestions.elavatorSystem;

import LLDQuestions.elavatorSystem.display.ElevatorDisplay;
import LLDQuestions.elavatorSystem.enums.ElevatorState;

public class ElevatorCar {
    private int id;
    private ElevatorDisplay display;
    private ElevatorPanel panel;
    private Door door;
    private ElevatorState state;

    public ElevatorCar(int id, ElevatorDisplay display, ElevatorPanel panel, Door door, ElevatorState state) {
        this.id = id;
        this.display = display;
        this.panel = panel;
        this.door = door;
        this.state = state;
    }

    public void openDoor() {
        System.out.println("opening door of elevator");
    }

    public void closeDoor() {
        System.out.println("closing door of elevator");
    }

    public void move() {
        System.out.println("move elevator");
    }

    public void stop() {
        System.out.println("stopping elevator");
    }
}
