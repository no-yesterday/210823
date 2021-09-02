package spring16aopjingtaidaili;

import org.junit.Test;

public class GameTest {
    //测试静态代理
    @Test
    public void test01(){
        Game wangzhe = new Game();
        JiaSuQi xunyou = new JiaSuQi();
        xunyou.setGame(wangzhe);  //set注入，王者 注入了迅游，迅游依赖了王者，迅游包含了王者，迅游是主体类
        xunyou.conNet();
    }
}
