package LLDQuestions.parkingLot.parkingspot;

import LLDQuestions.parkingLot.vehicles.Vehicle;

public abstract class ParkingSpot {
    private int id;
    private boolean isFree;
    private Vehicle vehicle;

    public boolean getIsFree() {
        return isFree;
    }
    public abstract boolean assignVehicle(Vehicle vehicle);
    public boolean removeVehicle() {
        if (!isFree) {
            isFree = true;
            vehicle = null;
            return true;
        }
        return false;
    }
}