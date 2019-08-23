package PO;

import java.util.Set;

public class Teacher {
    private int teacherID;
    private String teacherName;
    private Set Courses;

    public int getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Set getCourses() {
        return Courses;
    }

    public void setCourses(Set courses) {
        Courses = courses;
    }
}
