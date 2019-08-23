package Test;

import PO.Course;
import PO.Teacher;
import org.hibernate.Session;

import java.util.Iterator;
import java.util.Set;

public class Query1 {
    public static void main(String[] args) {
        Session session=util.HibernateSessionFactory.getSession();

        Teacher teacher=(Teacher)session.get(Teacher.class,1);
        System.out.println(teacher.getTeacherName());
        Set set=teacher.getCourses();
        Iterator iterator=set.iterator();
        while (iterator.hasNext()){
            Course course=(Course)iterator.next();
            System.out.println(course.getCourseName());
        }

        util.HibernateSessionFactory.closeSession();
    }
}
