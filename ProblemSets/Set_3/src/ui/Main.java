package ui;

import model.Calendar;
import model.Entry;
import model.Event;

import java.sql.Time;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = new Calendar();
        Event my_event = new Event(new Date(), "my first event.");
        calendar.addEntry(my_event);
        calendar.printEntries();


    }
}
