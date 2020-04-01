package test;

import model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class EntryTest {
    private Event event;
    private Meeting meeting;
    private Reminder reminder;

    @BeforeEach
    public void setUp() {
        event = new Event(new Date(), "event");
        meeting = new Meeting(new Date(), "meeting");
        reminder = new Reminder(new Date(), "reminder");
    }

    @Test
    public void testEntry() {
        assertFalse(event.isRepeatingEntry());
        event.setIntervalOfRepetition(5);
        assertTrue(event.isRepeatingEntry());
        assertEquals(5, event.getIntervalOfRepetition());
    }

    @Test
    public void testEvent() {
        assertEquals(null, event.getReminder());
        event.setReminder(reminder);
        assertEquals(reminder, event.getReminder());
        assertEquals(0, reminder.getNotes().size());
        Note note  = new Note("testnote");
        reminder.addNote(note);
        assertEquals(1, reminder.getNotes().size());
        event.getReminder().getNotes().contains(note);
    }

    @Test
    public void testMeeting() {
        assertEquals(null, meeting.getReminder());
        meeting.setReminder(reminder);
        assertEquals(meeting.getReminder(), reminder);
        assertEquals(0,meeting.getAttendees().size());
        Attendee attendee = new Attendee("person", "person@mail.com");
        meeting.addAttendee(attendee);
        assertEquals(1,meeting.getAttendees().size());
        assertTrue(meeting.getAttendees().contains(attendee));
    }

    @Test
    public void testReminder() {
        assertEquals(0,reminder.getNotes().size());
        Note note  = new Note("testnote");
        reminder.addNote(note);
        assertEquals(1, reminder.getNotes().size());
        assertTrue(reminder.getNotes().contains(note));
    }
}
