package model;

import java.sql.Time;
import java.util.Date;

public abstract class Entry {
    private Date datetime;
    private Time time;
    private String label;

    private int intervalOfRepetition = 0;

    // REQUIRES a valid date and time, label can be null
    // MODIFIES this
    // EFFECTS, constructs
    public Entry(Date datetime, String label) {
        this.datetime = datetime;
        this.label = label;
    }

    // EFFECTS returns if this entry is repeating, which is the case if the interval of repetition is set.
    public boolean isRepeatingEntry() {
        return this.intervalOfRepetition != 0;
    }

    // Getters
    public Date getDateTime() {
        return this.datetime;
    }
    public String getLabel(){
        return this.label;
    }
    public int getIntervalOfRepetition() {
        return this.intervalOfRepetition;
    }

    // Setters
    public void setIntervalOfRepetition(int intervalOfRepetition) {
        this.intervalOfRepetition = intervalOfRepetition;
    }

}
