package LLDQuestions.elavatorSystem;

import LLDQuestions.elavatorSystem.buttons.DoorButton;
import LLDQuestions.elavatorSystem.buttons.ElevatorButton;

import java.util.ArrayList;
import java.util.List;

public class ElevatorPanel {
    private List<ElevatorButton> floorButtons;
    private DoorButton openButton;
    private DoorButton closeButton;

    public ElevatorPanel() {
        this.floorButtons = new ArrayList<>();
        this.openButton = new DoorButton();
        this.closeButton = new DoorButton();
    }
}
