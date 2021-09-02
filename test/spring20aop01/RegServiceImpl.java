package spring20aop01;

public class RegServiceImpl implements RegService{
    @Override
    public void addUser() {
        System.out.println("调用了dao层，这个是 会员的注册功能");
        //注册完毕以后 应当给顾客 发送一条短信通知，提示 您的手机号已经注释了什么什么
        //订单。。。消费。。。违规i。。等
    }

    @Override
    public void loginUser() {
        System.out.println("调用了dao层，这是登录的功能");
        //登录之前来个通知
    }

    @Override
    public void transMoney() {
        System.out.println("转账。。。");
    }
}
