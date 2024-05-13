package LLDQuestions.elavatorSystem.buttons;

public class DoorButton extends Button{
    @Override
    public void pressDown() {
        System.out.println("Door button pressed");
    }

    @Override
    public boolean isPressed() {
        return false;
    }
}
