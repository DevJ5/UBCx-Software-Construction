package model;

import java.sql.Time;
import java.util.Date;

public abstract class Entry {
    public Date date;
    public Time time;
    public String label;
    public boolean isRepeating;
    public int intervalOfRepetition = 0;

    public Entry(Date date, Time time, String label, boolean isRepeating, int intervalOfRepetition) {
        this.date = date;
        this.time = time;
        this.label = label;
        this.isRepeating = isRepeating;
        this.intervalOfRepetition = intervalOfRepetition;
    }

    //Getters
    public Date getDate() {
        return this.date;
    }
    public Time getTime() {
        return this.time;
    }
    public String getLabel(){
        return this.label;
    }
    public boolean getIsRepeating() {
        return this.isRepeating;
    }
    public int getIntervalOfRepetition() {
        return this.intervalOfRepetition;
    }

}
