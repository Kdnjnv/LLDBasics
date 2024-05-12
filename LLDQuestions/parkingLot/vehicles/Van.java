package LLDQuestions.parkingLot.vehicles;

import LLDQuestions.parkingLot.ParkingTicket;

public class Van extends Vehicle{

    public Van(String licenseNum) {
        super(licenseNum);
    }

    @Override
    public void assignTicket(ParkingTicket parkingTicket) {
        System.out.println("assign ticket to van" + parkingTicket);
    }
}
