package LLDQuestions.elavatorSystem.buttons;

public class ElevatorButton extends Button{
    private int destinationFloor;

    public ElevatorButton(int dest) {
        super(false);
        this.destinationFloor = dest;
    }


    @Override
    public void pressDown() {
        System.out.println("Elevator button is pressed");
    }

    @Override
    public boolean isPressed() {
        return false;
    }
}
