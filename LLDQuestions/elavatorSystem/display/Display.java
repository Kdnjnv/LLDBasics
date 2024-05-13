package LLDQuestions.elavatorSystem.display;

import LLDQuestions.elavatorSystem.enums.Direction;

public abstract class Display {
    public abstract void showDisplay();
    private Direction currentDir;
    private int floorNum;
    public Display(Direction currentDir, int floorNum) {
        this.currentDir = currentDir;
        this.floorNum = floorNum;
    }
}
