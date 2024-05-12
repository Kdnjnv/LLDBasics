package LLDQuestions.parkingLot.vehicles;

import LLDQuestions.parkingLot.ParkingTicket;

public abstract class Vehicle {
    private String licenseNum;

    public Vehicle(String licenseNum) {
        this.licenseNum = licenseNum;
    }
    public abstract void assignTicket(ParkingTicket parkingTicket);
}
