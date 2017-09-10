package com.example.raysmusicexchange;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by allysonwilson on 9/10/17.
 */

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before() { sheetMusic = new SheetMusic( 5.00, 6.00, "Sheet Music") ; }

    @Test
    public void testCalculateMarkUp() {
        assertEquals(1.00, 0.01, sheetMusic.calculateMarkUp() );
    }

    @Test
    public  void testHasSalePrice() {
        assertEquals(6.00, 0.01, sheetMusic.getSalePrice() );
    }
}
