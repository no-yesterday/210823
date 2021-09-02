package spring20aop01;

//通知类，都统统的成为 切面类
public class MessageAspect {
    public void sendMsg(){
        System.out.println("给顾客发送一条通知！！！");
    }

    //环绕通知的切面
    public void roundMsg(){
        //我是上面的
        //目标方法
        //
    }
}
