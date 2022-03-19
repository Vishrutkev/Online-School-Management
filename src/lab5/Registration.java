package lab5;

public class Registration {
    // TODO: implement this class
    private final String subjectTitle;
    private int marks;
    private Instructor instructor;
    private String letterGrade;
    private String qualiDescription;

    public Registration(String subjectTitle) {
        this.subjectTitle = subjectTitle;
    }

    public  Registration(String subjectTitle, Instructor instructor){
        this.subjectTitle = subjectTitle;
        this.instructor = instructor;

    }

    public String getTitle() {
        return this.subjectTitle;
    }

    public int getMarks() {
       return this.marks;
    }

    public Instructor getInstructor() {
        return instructor;
    }


    public String[] getGradeReport() {
        if ((this.marks < 49) | (this.marks == 0)){
            letterGrade = "F";
            qualiDescription = "Failing";
        } else if ((this.marks >= 50) && (this.marks < 60)){
             letterGrade = "D";
             qualiDescription = "Passing";
        } else if ((this.marks >= 60) && (this.marks < 70)){
             letterGrade = "C";
             qualiDescription = "Competent";
        }else if ((this.marks >= 70) && (this.marks < 80)){
             letterGrade = "B";
             qualiDescription = "Good";
        }else if ((this.marks >= 80) && (this.marks < 90)){
             letterGrade = "A";
             qualiDescription = "Excellent";
        }else if ((this.marks >= 90) && (this.marks <= 100)){
             letterGrade = "A+";
             qualiDescription = "Exceptional";
        }

        return new String[]{letterGrade,qualiDescription};
    }

    public String getInformation() {
        String info;
        if (instructor == null){
            info = this.subjectTitle + " has not yet been assigned an instructor";
        } else {
            info = this.subjectTitle + ", taught by " + instructor.getName() + ", is completed with raw marks " + this.marks +" (" + this.letterGrade + " ; " + this.qualiDescription+")";
        }
        return info;
    }


    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

}