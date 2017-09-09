package com.example.raysmusicexchange;

/**
 * Created by allysonwilson on 9/8/17.
 */

public class Guitar
        extends Instrument
        implements Playable {

    private int numberOfStrings;

    public Guitar(String color, String type, int numberOfStrings){
        super(color, type);
        this.numberOfStrings = numberOfStrings;
    }

    public String soundOfInstrument() {
        return "strum, strum";
    }

    public String getColor() {
        return this.color;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }
}

