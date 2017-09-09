package com.example.raysmusicexchange;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by allysonwilson on 9/9/17.
 */

public class TubaTest {

    Tuba tuba;


    @Before
    public void before() { tuba = new Tuba( "Gold", "Brass", 3) ; }

    @Test
    public void testHasNumberOfValves() {
        assertEquals( 3, tuba.getNumberOfValves() ); }
}

