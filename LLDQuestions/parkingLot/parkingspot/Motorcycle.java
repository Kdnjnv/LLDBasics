package LLDQuestions.parkingLot.parkingspot;

import LLDQuestions.parkingLot.vehicles.Vehicle;

public class Motorcycle extends ParkingSpot {

    @Override
    public boolean assignVehicle(Vehicle vehicle) {
        System.out.println("assign Motorcycle spot");
        return true;
    }
}
