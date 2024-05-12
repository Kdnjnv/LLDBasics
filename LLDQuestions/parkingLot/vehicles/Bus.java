package LLDQuestions.parkingLot.vehicles;

import LLDQuestions.parkingLot.ParkingTicket;

public class Bus extends Vehicle{
    public Bus(String licenseNum) {
        super(licenseNum);
    }

    @Override
    public void assignTicket(ParkingTicket parkingTicket) {
        System.out.println("assign ticket to bus" + parkingTicket);
    }
}