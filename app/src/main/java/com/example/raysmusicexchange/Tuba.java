package com.example.raysmusicexchange;

///**
// * Created by allysonwilson on 9/9/17.
// */

public class Tuba
        extends Instrument
        implements Playable {

    private int numberOfValves;

    public Tuba(String color, String type, int numberOfValves){
        super(color, type);
        this.numberOfValves = numberOfValves;

    }

    public int getNumberOfValves() {
        return numberOfValves;
    }

    public String soundOfInstrument() {
        return "Bmp, bum, bump";
    }
}
