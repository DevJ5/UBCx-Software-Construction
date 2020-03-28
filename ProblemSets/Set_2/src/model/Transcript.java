package model;

public class Transcript {
    // REQUIRES: course != null, 0.0 <= grade <= 4.0
    // MODIFIES: this
    // EFFECTS: adds a grade to a certain course
    public void addGrade(String course, double grade){ }

    // REQUIRES: a course the student has already taken
    // EFFECTS: returns a String in the format CourseName: Grade
    public String getCourseAndGrade(String course){ return null; }

    // EFFECTS: prints the full transcript
    public void printTranscript(){ }

    // EFFECTS: returns the GPA
    public double getGPA(){ return 0.0; }
}
