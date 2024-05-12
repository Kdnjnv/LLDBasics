package LLDQuestions.parkingLot.payment;

import LLDQuestions.parkingLot.PaymentStatus;

public abstract class Payment {

    double amount;
    PaymentStatus status;
    int timestamp;

    public abstract void calculate();

    public abstract void initiateTransaction(double amount);
}
