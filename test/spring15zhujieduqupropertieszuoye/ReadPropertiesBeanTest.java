package spring15zhujieduqupropertieszuoye;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReadPropertiesBeanTest {
    @Test
    public void test01(){
        String xml = "spring15zhujieduqupropertieszuoye/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);

        ReadPropertiesBean readPropertiesBean = ac.getBean("readPropertiesBean", ReadPropertiesBean.class);
        System.out.println("readPropertiesBean = " + readPropertiesBean);
    }
}
