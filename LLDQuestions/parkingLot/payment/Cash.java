package LLDQuestions.parkingLot.payment;

public class Cash extends Payment{
    @Override
    public void calculate() {
        System.out.println("Calculating payment and will be paid by cash");
        this.amount = 10;
    }

    @Override
    public void initiateTransaction(double amount) {
        System.out.println("Initiating cash payment");
    }
}
