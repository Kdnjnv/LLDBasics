package LLDQuestions.elavatorSystem.buttons;

public abstract class Button {
    private boolean status;
    public abstract void pressDown();
    public abstract boolean isPressed();
}
