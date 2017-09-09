package com.example.raysmusicexchange;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by allysonwilson on 9/8/17.
 */

public class GuitarTest {
    Guitar guitar;

    @Before
    public void before() { guitar = new Guitar("Black", "String", 6); }

    @Test
    public void testHasColor() {
        assertEquals("Black", guitar.getColor() );
    }

    @Test
    public void testHasType() {
        assertEquals("String", guitar.getType() );
    }

    @Test
    public void TestHasNumberOfStrings(){
        assertEquals( 6, guitar.getNumberOfStrings() );
    }

     @Test
     public void TestHasSoundOfInstrument() { assertEquals("strum, strum", guitar.soundOfInstrument() );}


}

