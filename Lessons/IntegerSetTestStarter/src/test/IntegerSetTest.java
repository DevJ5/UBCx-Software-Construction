package test;

import model.IntegerSet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IntegerSetTest {
    IntegerSet testSet;
    private static final int NUM = 3;

    @BeforeEach
    public void setup() {
        this.testSet = new IntegerSet();
    }

    @Test
    public void testInsertNotThere() {
        checkEmptySetAndDoesntContainNum(NUM);
        testSet.insert(NUM);
        checkSetContainsOnce(NUM);
    }

    @Test
    public void testInsertAlreadyThere() {
        checkEmptySetAndDoesntContainNum(NUM);
        testSet.insert(NUM);
        checkSetContainsOnce(NUM);
        testSet.insert(3);
        checkSetContainsOnce(NUM);
    }

    private void checkEmptySetAndDoesntContainNum(int num) {
        assertEquals(0, testSet.size());
        assertFalse(testSet.contains(num));
    }

    private void checkSetContainsOnce(int num) {
        assertTrue(testSet.contains(num));
        assertEquals(1, testSet.size());
    }

}
