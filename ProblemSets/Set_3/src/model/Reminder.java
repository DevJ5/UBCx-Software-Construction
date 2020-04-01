package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Reminder extends Entry {
    private List<Note> notes;

    public Reminder(Date datetime, String label) {
        super(datetime, label);
        this.notes = new ArrayList<Note>();
    }

    public void addNote(Note note) {
        this.notes.add(note);
    }

    public List<Note> getNotes() {
        return this.notes;
    }
}
