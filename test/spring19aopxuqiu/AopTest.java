package spring19aopxuqiu;

import org.junit.Test;
import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

import java.lang.reflect.Method;

public class AopTest {
    @Test
    public void test01(){
        //排队
        //存钱
        //之前是一个类 现在是两个类
//        PaiDui paiDui = new PaiDui();  //次要业务 不应该出现在这个方法中  那么我们应该怎么实现 排号这个方法呢
//        paiDui.paiHao();

        BankServiceImpl bank = new BankServiceImpl();  //主要业务 问题来了
        bank.cunQian();  //save add insert into bank values (?,?,?,?,?)

        //问题：
        //次要业务 不应该出现在这个方法中 ，那么我们应该怎么实现 排号这个方法呢
        //即 ： 如何让 Bank 类 在不改变源代码的基础上  添加这个排队的方法，
    }

    @Test  //使用动态代理 解决切面类 + 主要业务 组合在一起
    public void test02(){
        //排队
        //存钱
        //1.目标对象
        BankService target = new BankServiceImpl();
        //2.代理对象
        BankService bankService = (BankService) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                        //在这里可以增强我们的目标对象 i，其实就是 直接把 切面类拿过来就可以了。
                        PaiDui.paiHao();//学名： 织入
                        System.out.println("被织入了");
                        Object result = method.invoke(target, objects);
                        return result;
                    }
                }
        );
        bankService.cunQian();
    }
}
