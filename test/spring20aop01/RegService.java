package spring20aop01;

//这是 主要业务
public interface RegService {
    //注册一个会员
    public void addUser();  //切入点 spring20aop01.RegService.addUser

    //登录的时候，登录之前 发个 短信验证
    public void loginUser();

    //环绕通知 转账
    void transMoney();
}
