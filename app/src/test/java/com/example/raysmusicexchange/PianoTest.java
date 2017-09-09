package com.example.raysmusicexchange;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by allysonwilson on 9/9/17.
 */

public class PianoTest {

    Piano piano;

@Before
    public void before() { piano = new Piano( "white", "string", 88); }

    @Test
    public void testHasColor() {
        assertEquals( "white", piano.getColor() );
    }

    @Test
    public void testHasType() {
        assertEquals( "string" , piano.getType() );
    }

    @Test
    public void testHasNumberOfKeys() {
        assertEquals( 88, piano.getNumberOfKeys() );
    }

    @Test
    public void testSoundOfInstrument() {
        assertEquals( "tinkley" , piano.soundOfInstrument());
    }
}

