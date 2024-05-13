package LLDQuestions.elavatorSystem;

import LLDQuestions.elavatorSystem.display.HallDisplay;

public class Floor {
    private HallDisplay display;
    private HallPanel panel;

    public Floor(HallDisplay display, HallPanel panel) {
        this.display = display;
        this.panel = panel;
    }

    public boolean isBottomMost() {
        return false;
    }

    public boolean isTopMost() {
        return false;
    }
}
