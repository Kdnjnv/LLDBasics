package LLDQuestions.parkingLot.parkingspot;

import LLDQuestions.parkingLot.vehicles.Vehicle;

public class Compact extends ParkingSpot {

    @Override
    public boolean assignVehicle(Vehicle vehicle) {
        System.out.println("assign compact spot");
        return true;
    }
}
