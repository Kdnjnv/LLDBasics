package LLDQuestions.parkingLot.vehicles;

import LLDQuestions.parkingLot.ParkingTicket;

public class Car extends Vehicle{

    public Car(String licenseNum) {
        super(licenseNum);
    }

    @Override
    public void assignTicket(ParkingTicket parkingTicket) {
        System.out.println("assign ticket to car" + parkingTicket);
    }
}
