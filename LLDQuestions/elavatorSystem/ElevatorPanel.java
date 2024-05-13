package LLDQuestions.elavatorSystem;

import LLDQuestions.elavatorSystem.buttons.CloseButton;
import LLDQuestions.elavatorSystem.buttons.ElevatorButton;
import LLDQuestions.elavatorSystem.buttons.OpenButton;

import java.util.ArrayList;
import java.util.List;

public class ElevatorPanel {
    private List<ElevatorButton> floorButtons;
    private OpenButton openButton;
    private CloseButton closeButton;

    public ElevatorPanel() {
        this.floorButtons = new ArrayList<>();
        this.openButton = new OpenButton();
        this.closeButton = new CloseButton();
    }
}
