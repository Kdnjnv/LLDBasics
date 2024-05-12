package LLDQuestions.parkingLot.vehicles;

import LLDQuestions.parkingLot.ParkingTicket;

public class MotorCycle extends Vehicle{

    public MotorCycle(String licenseNum) {
        super(licenseNum);
    }

    @Override
    public void assignTicket(ParkingTicket parkingTicket) {
        System.out.println("assign tickte to motorcycle" + parkingTicket);
    }
}
