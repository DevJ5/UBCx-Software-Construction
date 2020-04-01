package test;

import model.Calendar;
import model.Event;
import model.Meeting;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalendarTest {
    private Calendar calendar;

    @BeforeEach
    public void setUp() {
        this.calendar = new Calendar();
    }

    @Test
    public void testAddEntry() {
        // new event
        Event event = new Event(new Date(), "testevent");
        assertEquals(calendar.getEntries().size(), 0);
        calendar.addEntry(event);
        assertEquals(calendar.getEntries().size(), 1);
        assertTrue(calendar.getEntries().contains(event));
        calendar.removeEntry(event);

        // new meeting
        Meeting meeting = new Meeting(new Date(), "meetingevent");
        assertEquals(calendar.getEntries().size(), 0);
        calendar.addEntry(meeting);
        assertEquals(calendar.getEntries().size(), 1);
        assertTrue(calendar.getEntries().contains(meeting));
        calendar.removeEntry(meeting);

        // new reminder
        Meeting reminder = new Meeting(new Date(), "reminder");
        assertEquals(calendar.getEntries().size(), 0);
        calendar.addEntry(reminder);
        assertEquals(calendar.getEntries().size(), 1);
        assertTrue(calendar.getEntries().contains(reminder));
        calendar.removeEntry(reminder);
        assertEquals(calendar.getEntries().size(), 0);
    }
}
