package spring02ouhe;

//工厂类,工厂模式，spring 创建 bean的底层 工厂模式
//使用工厂模式，代码更加灵活
//单例模式，已经讲过 6种 ，常用两种
//HR问： spring 框架中，使用到了哪些设计模式
public class FactoryBean {
    public static Usb getInstance( String beanName) throws Exception {
        Usb usb = null;
//        if (beanName.equals("MyTv")) {
//            usb = new MyTv();
//        }else if(beanName.equals("Computer")){
//            usb = new Computer();
//        }else if(beanName.equals("Mp4")){
//            usb = new Mp4();
//        }

        Class<?> aClass = Class.forName(beanName);//反射的优势，一行代码代替
        usb = (Usb) aClass.newInstance();

        return usb;
        //结论  大量的 new 对象 是造成 耦合的关键，那么 就需要一个框架 来解决 new对象的耦合呢
        //什么框架可以解决这个呢？  spring ，为什么spring 可以解决 new 对象的耦合呢？ ----->  底层的反射
    }
}
