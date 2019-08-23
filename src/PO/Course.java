package PO;

import java.util.Set;

public class Course {
    private int CourseId;
    private String CourseName;
    private Set teachers;

    public int getCourseId() {
        return CourseId;
    }

    public void setCourseId(int courseId) {
        CourseId = courseId;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public Set getTeachers() {
        return teachers;
    }

    public void setTeachers(Set teachers) {
        this.teachers = teachers;
    }
}
