package LLDQuestions.elavatorSystem;

import LLDQuestions.elavatorSystem.enums.DoorState;

public class Door {
    private DoorState doorState;

    public Door(DoorState doorState) {
        this.doorState = doorState;
    }

    public boolean isOpen() {
        return false;
    }
}
