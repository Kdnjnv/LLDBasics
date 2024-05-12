package LLDQuestions.parkingLot;

import LLDQuestions.parkingLot.parkingspot.ParkingSpot;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLot {

    private int id;
    private String name;
    private Address address;

    List<Entrance> entrances;
    List<Exit> exits;
    Map<String, List<ParkingSpot>> parkingSpots = new HashMap<>();

    private static ParkingLot parkingLot = null;

    private ParkingLot() {

    }

    public static ParkingLot getInstance() {
        if (parkingLot == null) {
            parkingLot = new ParkingLot();
        }
        return parkingLot;
    }

    public boolean isfull() {
        return false;
    }

    public ParkingTicket getParkingTicket() {
        ParkingTicket parkingTicket = new ParkingTicket();
        return parkingTicket;
    }

    public void addEntrance(Entrance entrance) {
        entrances.add(entrance);
    }

    public void addExit(Exit exit) {
        exits.add(exit);
    }


}
