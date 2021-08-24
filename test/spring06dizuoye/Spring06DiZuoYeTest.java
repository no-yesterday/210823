package spring06dizuoye;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring06DiZuoYeTest {
    @Test
    public void test01() {
        String xml = "spring06dizuoye/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);

        Person person = ac.getBean("person", Person.class);
        person.eat();

    }
}
