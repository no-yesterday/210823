package spring06di;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring06DiTest {

    //刚刚是以 set 方式注入的 ,这叫做set注入!!!  常用的
    @Test
    public void test01() {
        String xml = "spring06di/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);

        //我们要拿主体
        Person person = ac.getBean("person",Person.class);
        person.play();

        //思考题: 现在 2 个类 之间的关系
        //人 .... 手机 ,电脑 ,psp ,电视,等  如果有1000个能玩游戏的,需要修改1000次吗

        //思考题: 如何提高 依赖效率???
        //使用接口 同时也解耦了代码 ,让 依赖关系 有 实体类 依赖 编程 抽象的依赖
        //同理: 也解释了 java 3层架构中 ,为什么要用到接口...
    }
}
