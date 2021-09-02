package spring11duquprop;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class ReadPropTest {
    //第一种
    @Test
    public void test01() {
        String xml = "spring11duquprop/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);

        ComboPooledDataSource dataSource = ac.getBean("dataSource", ComboPooledDataSource.class);
        System.out.println("dataSource = " + dataSource);
        try {
            System.out.println("dataSource.getConnection = " + dataSource.getConnection());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //第二种
    @Test
    public void test02() {
        String xml = "spring11duquprop/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);

        ComboPooledDataSource dataSource = ac.getBean("dataSource1", ComboPooledDataSource.class);
        System.out.println("dataSource = " + dataSource);
        try {
            System.out.println("dataSource.getConnection = " + dataSource.getConnection());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //第三种
    @Test
    public void test03() {
        String xml = "spring11duquprop/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);

        ReadPropertiesBean readProperties = ac.getBean("readProperties", ReadPropertiesBean.class);
        System.out.println("readProperties = " + readProperties);
    }
}
