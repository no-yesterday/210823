package spring14zhujiechangyongzhuru;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * 注解版的常用类型注入
 */
@Component
public class Teacher3 {
    @Value("谢欣")
    private String name;
    @Value("19")
    private int age;
    //剩下的就是 集合 需要读取 xml 注入了

    @Value("#{friendNames}")
    private List<String> friendNames;
    @Value("#{loverNames}")
    private Set<String> loverNames;
    @Value("#{scores}")
    private Map<String, Double> scores;
    @Value("#{properties}")
    private Properties properties;
    @Value("#{url.name}")
    private String url;

    @Override
    public String toString() {
        return "Teacher3{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", friendNames=" + friendNames +
                ", loverNames=" + loverNames +
                ", scores=" + scores +
                ", properties=" + properties +
                ", url='" + url + '\'' +
                '}';
    }

}
