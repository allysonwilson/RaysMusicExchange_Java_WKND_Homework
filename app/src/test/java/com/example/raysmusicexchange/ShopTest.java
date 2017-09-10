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
    Piano piano;
    SheetMusic sheetMusic;
    ArrayList<Sellable> stock;


    @Before
    public void before() {
        stock = new ArrayList<Sellable>();
        shop = new Shop(stock);
        piano = new Piano( "white", "string", 88, 10.00, 12.00);
        sheetMusic = new SheetMusic( 5.00, 6.00, "Sheet Music") ;
        stock.add(piano);
        stock.add(sheetMusic);
    }
    @Test
    private void testAddItemToStock(){
        piano Piano
        sheetMusic SheetMusic
        AssertEquals(piano, sheetMusic, shop.getStock(); )
    }

}

