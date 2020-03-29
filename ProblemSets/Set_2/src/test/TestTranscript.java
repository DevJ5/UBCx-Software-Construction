package test;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestTranscript {
    @Test
    public void testOne() {
        fail();
    }

    @Test
    public void testTwo() {
        assertEquals(true, true);
        assertTrue("apples" == "apples");

    }
}
