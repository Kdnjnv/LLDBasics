package LLDQuestions.elavatorSystem.buttons;

import LLDQuestions.elavatorSystem.enums.Direction;

public class HallButton extends Button{
    private Direction direction;

    public HallButton(Direction direction) {
        super(false);
        this.direction = direction;
    }

    @Override
    public void pressDown() {
        System.out.println("Hall button pressed");
    }

    @Override
    public boolean isPressed() {
        return false;
    }
}
