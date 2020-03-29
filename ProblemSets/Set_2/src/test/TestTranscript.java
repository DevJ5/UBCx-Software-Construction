package test;

import model.Transcript;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestTranscript {
    Transcript testTranscript;

    @BeforeEach
    public void setUp() {
        this.testTranscript = new Transcript("John Doe", 123);
    }

    @Test
    public void testConstructor() {
        assertEquals("John Doe", testTranscript.getStudentName());
        assertEquals(123, testTranscript.getStudentID());

    }

    @Test
    public void testTwo() {
        assertEquals(1,3,1);

    }
}
