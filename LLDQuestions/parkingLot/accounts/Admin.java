package LLDQuestions.parkingLot.accounts;

import LLDQuestions.parkingLot.DisplayBoard;
import LLDQuestions.parkingLot.Entrance;
import LLDQuestions.parkingLot.Exit;
import LLDQuestions.parkingLot.ParkingTicket;
import LLDQuestions.parkingLot.parkingspot.ParkingSpot;

public class Admin extends Account {


    @Override
    public void resetPassword() {
        System.out.println("reset account password");
    }

    public void addParkingSpot(ParkingSpot parkingSpot) {
        System.out.println("add parking spot: " + parkingSpot);
    }

    public void removeParkingLot(ParkingSpot parkingSpot) {
        System.out.println("remove parking spot " + parkingSpot);
    }

    public boolean addDisplayBoard(String floorName, DisplayBoard displayBoard) {
        System.out.println("Display board: " + displayBoard + " is displayed at floor: " + floorName);
        return true;
    }

    public boolean addEntrance(Entrance entrance) {
        System.out.println("entrance is added " + entrance);;
        return true;
    }

    public boolean addExit(Exit exit) {
        System.out.println("exit is added" + exit);
        return true;
    }
}
