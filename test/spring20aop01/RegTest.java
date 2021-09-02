package spring20aop01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RegTest {
    //测试目的： 把msg 的切面 次要业务 融合 在主要业务 reg 里面去
    //用Spring 去实现
    @Test
    public void test01(){

        String xml = "spring20aop01/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);

        RegService regService = ac.getBean("regService", RegService.class);
        regService.addUser();
        System.out.println("============");
        regService.loginUser();
    }
}
