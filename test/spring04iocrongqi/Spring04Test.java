package spring04iocrongqi;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;
import java.util.Date;

/**
 * 容器的由来： 根据刚刚的 工厂模式 得出，一个项目中有着大量的对象
 * 那么 大量的对象需要管理，如果管理更方便，使用容器 ，把对象 统一处理
 *
 * Spring中的容器 IOC
 * IOC 有个思想 ： 控制反转，什么叫控制，我控制了你，你控制了我，我如何才算能控制你，你的出生 使用 死亡 都由我掌管
 * 什么叫做 反转： 事情本来有A 控制，现在变成 B 控制，
 *
 * 容器是控制反转的
 */
public class Spring04Test {
    /**
     * 传统的对象的 创建三种方式
     * 传统的对象，没有容器统一的管理
     */
    @Test
    public void test01(){
        //因为 我们说 spring 容器 是管理对象
        //对象的创建 有几种方式
        //传统的创建方式有三种
        //第一种：new 关键字
        Date date = new Date();
        System.out.println("------------------");
        //第二种：static 静态方法创建 静态工厂创建
        Calendar calendar = Calendar.getInstance();
        System.out.println("calendar = " + calendar);
        System.out.println("------------------");
        //第三种：实例工厂创建
        Date time = calendar.getTime();
        System.out.println("time = " + time);

        System.out.println("以上就是 传统创建的3种方式");

        //传统创建对象的 缺点：
        //1.控制权在哪里？  现在 在 test01 的方法中
        //2.对象创建的 执行顺序 有谁控制？  test01 的方法中

        //下面使用spring 如何创建对象 管理对象（创建，销毁，使用）

    }

    /**
     * spring 容器 管理对象，看spring 如何创建对象
     */
    @Test
    public void test02(){
        //1.加载 容器的 xml
        String xml = "spring04iocrongqi/applicationContext.xml";

        //2.xml文件一经加载，所有的对象 都已经诞生了，这就和传统的test01 创建对象不一样了
        //达到了 对象的统一管理，也就是对象的创建的 控制权 被 spring 拿走了
        //以前是 new 出来的，现在是Spring 通过反射 拿走了对象,这就是控制权的改变,这就是 控制反转
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        System.out.println("ac = " + ac);

        //如何取得对象
        Date date = ac.getBean("date", Date.class);
        System.out.println("date = " + date);

        //作用域
        Pc pc1 = ac.getBean("pc", Pc.class);
        Pc pc2 = ac.getBean("pc", Pc.class);
        System.out.println("pc1 = " + pc1);
        System.out.println("pc2 = " + pc2);
        System.out.println(pc1 == pc2);//默认为true  单例模式。即内存地址一样
        //加上scope = "prototype"  ==  就为false
        ((ClassPathXmlApplicationContext)ac).close();//关闭容器
        //如果 生命周期中使用 原型模式,那么 无法调用 对象的 摧毁方法.所以少用原型模式
    }

}
