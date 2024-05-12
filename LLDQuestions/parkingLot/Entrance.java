package LLDQuestions.parkingLot;

import designPatterns.factoryPattern.abstractFactory.Vehicle;

public class Entrance {
    private int id;

    public ParkingTicket getTicket(Vehicle vehicle) {
        System.out.println("get ticket for vehicle");
        ParkingTicket parkingTicket = new ParkingTicket();
        //add logic here
        return parkingTicket;
    }
}
