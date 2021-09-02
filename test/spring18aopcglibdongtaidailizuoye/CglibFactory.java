package spring18aopcglibdongtaidailizuoye;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibFactory implements MethodInterceptor {
    private LiuLanQi3 liuLanQi3;

    public CglibFactory(){
        liuLanQi3=new LiuLanQi3();
    }
    //在浏览器中  产生子类
    public LiuLanQi3 cglibCreator(){
        //1. 用字节码的增强器
        Enhancer enhancer=new Enhancer();
        //2.指定一个父类
        enhancer.setSuperclass(LiuLanQi3.class);
        //3.调用 工厂执行
        enhancer.setCallback(this);
        //4.创建
       LiuLanQi3 ll= (LiuLanQi3) enhancer.create();
        return ll;
    }

    //  方法的拦截  实现浏览器可以访问的目的
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
       Boolean b= (Boolean) method.invoke(liuLanQi3,objects);
         b=true;
        return b;
    }
}
