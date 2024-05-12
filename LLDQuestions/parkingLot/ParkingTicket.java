package LLDQuestions.parkingLot;

import LLDQuestions.parkingLot.payment.Payment;
import LLDQuestions.parkingLot.vehicles.Vehicle;

import java.util.Date;

public class ParkingTicket {

    private int ticketNumber;
    private Date entryTimestamp;
    private Date exitTimestamp;
    private double amount;
    private PaymentStatus paymentStatus;

    private Vehicle vehicle;
    private Entrance entrance;
    private Exit exit;
    private Payment payment;
}
