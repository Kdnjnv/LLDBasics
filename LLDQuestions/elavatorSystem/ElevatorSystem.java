package LLDQuestions.elavatorSystem;

public class ElevatorSystem {
    private Building building;
    public void monitoring() {
        System.out.println("moniroting from ElevatorSystem");
    }
    public void dispatcher() {
        System.out.println("Dispatching from dispatcher");
    }

    private ElevatorSystem() {
        this.building = Building.getInstance();
    }

    private static ElevatorSystem elevatorSystem = null;

    public static ElevatorSystem getInstance() {
        if (elevatorSystem == null) {
            elevatorSystem = new ElevatorSystem();
        }
        return elevatorSystem;
    }
}
