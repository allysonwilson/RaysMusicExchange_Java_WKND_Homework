package com.example.raysmusicexchange;

/**
 * Created by allysonwilson on 9/9/17.
 */

public class SheetMusic
        implements Sellable {

    private double boughtPrice;
    private double salePrice;
    private String type;

    public SheetMusic( double boughtPrice, double salePrice, String type){
        this.boughtPrice = boughtPrice;
        this.salePrice = salePrice;
        this.type = type;
    }

    public double calculateMarkUp() {
        return (0.20 * boughtPrice);
    }

    public double getSalePrice() {
        return (boughtPrice += calculateMarkUp()) ;
    }

    public double getBoughtPrice() {
        return boughtPrice;
    }
        public String getType() {
            return type;
        }
}