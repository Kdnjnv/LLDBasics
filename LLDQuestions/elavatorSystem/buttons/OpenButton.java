package LLDQuestions.elavatorSystem.buttons;

public class OpenButton extends Button{

    public OpenButton() {
        super(false);
    }

    @Override
    public void pressDown() {
        System.out.println("open the elevator gate");
    }

    @Override
    public boolean isPressed() {
        return super.isPressed();
    }
}
