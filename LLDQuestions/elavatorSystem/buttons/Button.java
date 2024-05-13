package LLDQuestions.elavatorSystem.buttons;

public abstract class Button {
    private boolean status;
    public abstract void pressDown();
    public boolean isPressed() {
        return status;
    }
    public Button(boolean status) {
        this.status = status;
    }
}
