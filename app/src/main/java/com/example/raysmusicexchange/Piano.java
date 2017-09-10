package com.example.raysmusicexchange;


/**
// * Created by allysonwilson on 9/8/17.
// */
//
public class Piano
        extends Instrument
        implements Playable , Sellable {

   private int numberOfKeys;
   private double boughtPrice;
   private double salePrice;

    public Piano(String color, String type, int numberOfKeys, double boughtPrice, double
salePrice){
        super(color, type);
        this.numberOfKeys = numberOfKeys;
        this.boughtPrice = 10.00;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public String soundOfInstrument() { return "tinkley"; }


    public double calculateMarkUp() {
        return (0.20 * boughtPrice) ;

    }

    public double getSalePrice() {
        return (boughtPrice += calculateMarkUp()) ;
    }
}

// sellingPrice = boughtPrice * 20% + boughtPrice;
//         return sellingPrice;
//(20 * 100)/sellingPrice