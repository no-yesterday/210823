package spring04iocrongqi;

public class Pc {
    //出生后的构造方法
    public Pc(){
        System.out.println("电脑的无参构造，就是 对象一诞生就会执行的方法,比如 人一出生就会哭,这个哭就是构造方法");
        System.out.println("构造方法 是对象一诞生就会执行的方法 一般多用来 初始化自己的属性 比如 颜色");
    }
    //对象的初始化方法
    public void initShow(){
        System.out.println("开机");
        System.out.println("电脑的初始化工作，是 对象一诞生就会执行的方法 和构造方法不同的是 ，他 多用直接调用自己的方法");
    }
    //对象的普通方法 周期中  成年中
    public void playGame(){
        System.out.println("电脑的普通方法，用来打游戏");
    }
    //对象的死亡方法 ，参考过滤器 ， servlet
    public void destroyObj(){
        System.out.println("电脑爆了");
    }
}
