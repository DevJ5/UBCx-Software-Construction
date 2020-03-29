package model;

public class Transcript {
    private String studentName;
    private int studentID;

    public Transcript(String studentName, int studentID) {

    }
    // REQUIRES: course != null, 0.0 <= grade <= 4.0
    // MODIFIES: this
    // EFFECTS: adds a grade to a certain course
    public void addGrade(String course, double grade){

    }

    // REQUIRES: a course the student has already taken
    // EFFECTS: returns a String in the format CourseName: Grade
    public String getCourseAndGrade(String course){ return null; }

    // EFFECTS: prints the full transcript (name, ID, course, grade)
    public void printTranscript(){ }

    // EFFECTS: returns the GPA
    public double getGPA(){ return 0.0; }

    // getters
    public String getStudentName() {
        return this.studentName;
    }

    public int getStudentID() {
        return 0;
    }
}
