package aoc.day01;

import java.util.List;

public class Lift {
    private int currentFloor;
    private int buttonPresses;
    private static final int BASEMENT_LEVEL = -1;

    public Lift() {
        this.currentFloor = 0;
        this.buttonPresses = 0;
    }

    public void pushButton(Button button) {
        switch (button) {
            case Button.UP -> goingUp();
            case Button.DOWN -> goingDown();
        }
    }

    public void ride(List<String> floorsToVisit, boolean basementIsDestination) {
        for (String floorToVisit : floorsToVisit) {
            for (char buttonPress : floorToVisit.toCharArray()) {
                pushButton(Button.fromChar(buttonPress));
                if (basementIsDestination && this.currentFloor == BASEMENT_LEVEL) {
                    break;
                }
            }
        }
    }

    public int getCurrentFloor() {
        return this.currentFloor;
    }

    public void goingUp() {
        this.currentFloor++;
        this.buttonPresses++;
    }

    public void goingDown() {
        this.currentFloor--;
        this.buttonPresses++;
    }

    public int getButtonPresses() {
        return this.buttonPresses;
    }
}
