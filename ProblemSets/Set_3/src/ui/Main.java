package ui;

import model.*;

import java.sql.Time;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = new Calendar();
        Event my_event = new Event(new Date(), "My birthday");
        calendar.addEntry(my_event);
        calendar.printEntries();

        my_event.setReminder(new Reminder(new Date(), "Need to be on time!"));
        my_event.getReminder().addNote(new Note("Oh and I need to buy champagne!"));


    }
}
