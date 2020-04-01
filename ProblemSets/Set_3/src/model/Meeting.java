package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Meeting extends Event {
    private List<Attendee> attendees;

    public Meeting(Date datetime, String label) {
        super(datetime, label);
        this.attendees = new ArrayList<Attendee>();
    }

    public void addAttendee(String name, String email) {
        this.attendees.add(new Attendee(name, email));
    }

    public void printAttendeeList() {
        for(Attendee attendee : attendees) {
            System.out.println(attendee.getName());
        }
    }

    public void emailAttendees() {
        for(Attendee attendee : attendees) {
            System.out.println(attendee.getEmail());
        }
    }


}
