package spring16aopjingtaidaizuoye;

import org.junit.Test;

public class LiuLanQiTest {
    //测试静态代理
    @Test
    public void test01(){
        LiuLanQi liuLanQi=new LiuLanQi();
        Vpn vpn=new Vpn();
        vpn.setLiuLanQi(liuLanQi);
        vpn.Fangwen();

    }
}
