package spring10basicdizuoye;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
    @Test
    public void test01(){
        String xml = "spring10basicdizuoye/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);

        Student student = ac.getBean("student", Student.class);
        System.out.println("student = " + student);
    }
    @Test
    public void test02(){
        String xml = "spring10basicdizuoye/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);

        Student student2 = ac.getBean("student2", Student.class);
        System.out.println("student2 = " + student2);
    }
}
