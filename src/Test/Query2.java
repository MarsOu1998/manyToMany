package Test;

import PO.Course;
import PO.Teacher;
import org.hibernate.Session;

import java.util.Iterator;
import java.util.Set;

public class Query2 {
    public static void main(String[] args) {
        Session session=util.HibernateSessionFactory.getSession();
        Course course=(Course)session.get(Course.class,3);
        Set set=course.getTeachers();
        Iterator iterator=set.iterator();
        while(iterator.hasNext()){
            Teacher teacher=(Teacher)iterator.next();
            System.out.println(teacher.getTeacherName());
        }
        util.HibernateSessionFactory.closeSession();
    }
}
