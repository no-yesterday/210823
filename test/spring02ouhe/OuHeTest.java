package spring02ouhe;

import org.junit.Test;

public class OuHeTest {
    //创建几个类，模拟耦合
    @Test
    public void test01(){
//        //如果使用电脑传输数据
//        Computer computer = new Computer();
//        computer.usbData();
//        //如果使用电视传输数据
//        MyTv myTv = new MyTv();
//        myTv.usbData();

//        //更新接口后，代码优化了，解耦一次
//        Usb usb = new MyTv();
//        usb.usbData();

        //需求1: 现在 new Computer();  new MyTv();  都有 usbData 的功能
        //问题： 直接修改 代码修改量比较大
        //想要把Computer类不用，修改成Tv
        //那么需要把usbData 方法提取成接口，然后使用多态的思想进行 代码更新，解耦一次
        //第一次 使用 接口，多态的思想 解耦，好处是，可以多次修改代码 不用改变量了，直接一个 usb 就可以代替上面的new对象
        //第二次解耦，即 代码更方便
        Usb u = FactoryBean.getInstance("Computer");
        u.usbData();
        //以上 第二次写法 是不是更优美，更 解耦了，让 用户 输入字符， 比 打开源代码 找到第几行更方便，将来源代码是需要加密的


    }
}
