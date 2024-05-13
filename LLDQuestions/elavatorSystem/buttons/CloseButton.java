package LLDQuestions.elavatorSystem.buttons;

public class CloseButton extends Button{

    public CloseButton() {
        super(false);
    }

    @Override
    public void pressDown() {
        System.out.println("close button called");
    }
}
