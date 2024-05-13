package LLDQuestions.elavatorSystem.display;

import LLDQuestions.elavatorSystem.enums.Direction;

public class HallDisplay extends Display{
    public HallDisplay(Direction currentDir, int floorNum) {
        super(currentDir, floorNum);
    }

    @Override
    public void showDisplay() {
        System.out.println("show display in hall");
    }
}
