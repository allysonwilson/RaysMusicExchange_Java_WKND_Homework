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
    public void hasColor() {
        assertEquals("Black", guitar.getColor() );
    }

    @Test
    public void hasType() {
        assertEquals("String", guitar.getType() );
    }

    @Test
    public void hasNumberOfStrings(){
        assertEquals( 6, guitar.getNumberOfStrings() );
    }
}
