package spring09basicdi;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TeacherElTest {
    @Test
    public void test01(){
        String xml = "spring09basicdi/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);

        TeacherEL teacherEl = ac.getBean("teacherEl", TeacherEL.class);
        System.out.println("teacherEl = " + teacherEl);
    }
}
