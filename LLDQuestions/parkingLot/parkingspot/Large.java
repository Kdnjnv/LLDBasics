package LLDQuestions.parkingLot.parkingspot;

import LLDQuestions.parkingLot.vehicles.Vehicle;

public class Large extends ParkingSpot {

    @Override
    public boolean assignVehicle(Vehicle vehicle) {
        System.out.println("allot Large spot");
        return true;
    }
}
