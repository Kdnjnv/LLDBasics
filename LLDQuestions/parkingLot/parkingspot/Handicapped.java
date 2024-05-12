package LLDQuestions.parkingLot.parkingspot;

import LLDQuestions.parkingLot.vehicles.Vehicle;

public class Handicapped extends ParkingSpot {

    @Override
    public boolean assignVehicle(Vehicle vehicle) {
        System.out.println("assign Handicapped spot");
        return true;
    }
}
