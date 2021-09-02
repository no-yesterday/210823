package spring15zhujieduqupropertieszuoye;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ReadPropertiesBean {

    @Value("#{prop.name}")
    private String name;

    @Value("#{prop.pwd}")
    private String pwd;

    @Value("21")
    private int age;

    @Override
    public String toString() {
        return "ReadPropertiesBean{" +
                "name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", age=" + age +
                '}';
    }
}
