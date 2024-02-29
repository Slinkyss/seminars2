package model;

public class Grade {

    private long g_ID;
    private int value;

    private Student student;

    private Course course;


    public long getG_ID() {
        return g_ID;
    }

    public void setG_ID(long g_ID) {
        this.g_ID = g_ID;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if(value > 0 && value < 11)
            this.value = value;
        else
            this.value = 0;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        if(course != null)
            this.course = course;
        else
            this.course = null;
    }
}
