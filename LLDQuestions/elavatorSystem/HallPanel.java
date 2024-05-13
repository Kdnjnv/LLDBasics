package LLDQuestions.elavatorSystem;

import LLDQuestions.elavatorSystem.buttons.HallButton;
import LLDQuestions.elavatorSystem.enums.Direction;

public class HallPanel {
    private HallButton upButton;
    private HallButton downButton;

    public HallPanel() {
        this.upButton = new HallButton(Direction.UP);
        this.downButton = new HallButton(Direction.DOWN);
    }
}
