package spring12zhujie;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component 这个注解叫做 通用注解
//@Controller //等于 @Component  用在controller 层
//@Service //等于 @Component 用在 Service 层
//@Repository("ren")  //("起别名")  可以起别名 ，如果不起，那么这个id 就是类名的首字母小写   //类名一般不要起太短
@Repository  // 等于 @Component 用在dao 层。但是一般不用，因为dao层 有xml映射
        //  @Component    @Controller    @Service    @Repository  四个简称 四大注解
//@Component  //这个注解 就等于在 xml 中写了bean 标签  <bean id="human" class="spring12zhujie.Human"></bean>
//@Repository("ren")   // 可以起别名, 如果不起,那么这个id 就是 类名的小写.
@Scope("prototype")  //加这个就是 原型/多利  <bean id="human" class="spring12zhujie.Human" scope = "prototype" lazy-init = "true" ></bean>
@Lazy  //加这个就是 懒加载
public class Human {
    public Human(){
        System.out.println("human 对象诞生了");
    }

    @PostConstruct //构造器之前的方法，意思就是 生命周期      <bean id = "pc" class="spring12zhujie.Human" init-method="initShow" destroy-method="destroyObj"></bean>

    public void initShow(){
        System.out.println("哭");
    }

    @PreDestroy
    public void destroyObj(){
        System.out.println("临死前的遗嘱");
    }
}
