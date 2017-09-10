package com.example.raysmusicexchange;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import static junit.framework.Assert.assertEquals;

/**
 * Created by allysonwilson on 9/10/17.
 */

public class ShopTest {
    Shop shop;
    ArrayList<Sellable> stock;


    @Before
    public void before() {
        stock = new ArrayList<>();
        stock.add(new Piano( "white", "string instrument", 88, 10.00, 12.00) );
        stock.add(new SheetMusic(5.00, 6.00, "Sheet Music") );


    }

    @Test
   public void canGetStock(){
//        arrange
        shop = new Shop();
//        act
        ArrayList<Sellable> result = shop.getStock();
//        Assert
        assertEquals("string instrument", "Sheet Music", shop.getStock() );

    }

}

//  piano = new Piano( "white", "string", 88, 10.00, 12.00);
//        sheetMusic = new SheetMusic( 5.00, 6.00, "Sheet Music") ;
//        stock.add(piano);
//        stock.add(sheetMusic);
//
//    assertEquals("Guitar", ((Guitar) result.get(0)).getInstrument());