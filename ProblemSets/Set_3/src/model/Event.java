package model;

import java.sql.Time;
import java.util.Date;

public class Event extends Entry {
    private Reminder reminder;

    public Event(Date datetime, String label) {
        super(datetime, label);
    }

    // Getters
    public Reminder getReminder() {
        return reminder;
    }
    // Setters
    public void setReminder(Reminder reminder) {
        this.reminder = reminder;
    }
}
