package com.example.raysmusicexchange;


/**
// * Created by allysonwilson on 9/8/17.
// */
//
public class Piano
        extends Instrument
        implements Playable , Sellable {

   private int numberOfKeys;
   private int boughtPrice;
   private int sellingPrice;

    public Piano(String color, String type, int numberOfKeys, int boughtPrice, int
sellingPrice){
        super(color, type);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public String soundOfInstrument() { return "tinkley"; }


    public int calculateMarkup() {
        return 20% ;

    }
}

// sellingPrice = boughtPrice * 20% + boughtPrice;
//         return sellingPrice;
