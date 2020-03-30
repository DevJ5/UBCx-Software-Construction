package test;

import model.FerryCard;
import model.Passenger;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class PassengerTest {
    private static final String INIT_NAME = "Bruce Wayne";
    private Passenger testPassenger;

    @Before
    public void setUp() {
        testPassenger = new Passenger(INIT_NAME);
    }

    @Test
    public void testPassengerConstructor() {
        assertEquals(testPassenger.getName(), INIT_NAME);
        assertEquals(testPassenger.getFerryCard().getOwner(), testPassenger);
    }

    @Test
    public void testPassengerChangeName() {
        testPassenger.setName("Batman");
        assertEquals("Batman",testPassenger.getName());
    }

    @Test
    public void testChangeFerryCard() {
        FerryCard fc1 = testPassenger.getFerryCard();
        testPassenger.setFerryCard(fc1);
        assertEquals(fc1, testPassenger.getFerryCard());
        testPassenger.setFerryCard(new FerryCard());
        assertNotEquals(fc1, testPassenger.getFerryCard());
    }

}