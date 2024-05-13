package LLDQuestions.elavatorSystem.display;

import LLDQuestions.elavatorSystem.enums.Direction;

public class ElevatorDisplay extends Display{
    private int capacity;

    public ElevatorDisplay(int capacity, Direction currentDir, int floorNum) {
        super(currentDir, floorNum);
        this.capacity = capacity;
    }

    @Override
    public void showDisplay() {
        System.out.println("showing display in elevator display");
    }
}
