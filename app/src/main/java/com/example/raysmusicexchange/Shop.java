package com.example.raysmusicexchange;

import java.util.ArrayList;

/**
 * Created by allysonwilson on 9/10/17.
 */

public class Shop {
    private ArrayList<Sellable> stock;

    public Shop() {
        this.stock = new ArrayList<>();
    }

    public ArrayList<Sellable> getStock() {
        return this.stock;
    }

}


//    public void getStock() {
//
//        Piano piano;
//        SheetMusic sheetMusic;
//        {return this.stock.add(piano, sheetMusic);}
//    }