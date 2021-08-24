package spring06di;

//我是手机 对象,我是次要的类,我是被主体人类 来使用,来依赖的
public class Phone implements PlayGame{
    public Phone(){
        System.out.println("手机对象 诞生了");
    }
    public void game(){
        System.out.println("手机 打游戏");
    }
}
