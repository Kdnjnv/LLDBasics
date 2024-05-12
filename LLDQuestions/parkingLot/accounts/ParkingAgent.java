package LLDQuestions.parkingLot.accounts;

public class ParkingAgent extends Account {
    @Override
    public void resetPassword() {
        System.out.println("reset password for parking agent");
    }

    public boolean processTicket() {
        System.out.println("parking agent processing ticket");
        return true;
    }
}
