package LLDQuestions.elavatorSystem.buttons;

import LLDQuestions.elavatorSystem.enums.Direction;

public class HallButton extends Button{

    private Direction buttonSign;

    public HallButton(Direction buttonSign) {
        this.buttonSign = buttonSign;
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
