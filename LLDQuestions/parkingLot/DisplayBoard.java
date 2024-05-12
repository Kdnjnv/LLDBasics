package LLDQuestions.parkingLot;

import LLDQuestions.parkingLot.parkingspot.ParkingSpot;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DisplayBoard {

    private Map<String, List<ParkingSpot>> parkingSpots = new HashMap<>();
    private int id;

    public DisplayBoard(int id) {
        this.id = id;
        parkingSpots = new HashMap<>();
    }

    public void addParkingSpot(String spotType, List<ParkingSpot> spots) {
        List<ParkingSpot> earlierSpots =  parkingSpots.get(spotType);
        earlierSpots.addAll(spots);

        parkingSpots.put(spotType, earlierSpots);
    }

    public void showFreeSpots() {
        System.out.println("show list of free spots");
    }
}
