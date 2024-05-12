package LLDQuestions.parkingLot.payment;

public class Card extends Payment{
    @Override
    public void calculate() {
        System.out.println("calculating payment to be paid by card");
        this.amount = 10;
    }

    @Override
    public void initiateTransaction(double amount) {
        System.out.println("Initiating card payment");
    }
}
