package model;

import java.util.ArrayList;
import java.util.List;

public class Calendar {
    private List<Entry> entries;

    public Calendar() {
        this.entries = new ArrayList<Entry>();
    }

    public void addEntry(Entry entry) {
        entries.add(entry);
        System.out.println("Entry succesfully added to calendar.");
    }

    public void printEntries() {
        for (Entry entry: entries) {
            System.out.println(entry.getDateTime() + "\n" + entry.getLabel());
        }
    }

    public List<Entry> getEntries() {
        return entries;
    }

    public void removeEntry(Event event) {
        entries.remove(event);
    }
}
