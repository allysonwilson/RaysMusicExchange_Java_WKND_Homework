package com.example.raysmusicexchange;


/**
// * Created by allysonwilson on 9/8/17.
// */
//
public class Piano
        extends Instrument
        implements Playable {

   private int numberOfKeys;

    public Piano(String color, String type, int numberOfKeys){
        super(color, type);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public String soundOfInstrument() { return "tinkley"; }


}


