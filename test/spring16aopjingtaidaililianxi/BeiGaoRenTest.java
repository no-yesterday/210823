package spring16aopjingtaidaililianxi;

import org.junit.Test;

public class BeiGaoRenTest {
    @Test
    public void test01(){
        BeiGaoRen zhangSan = new BeiGaoRen();
        LvShi liSi = new LvShi();
        liSi.setBeiGaoRen(zhangSan);
        liSi.faLv();
    }
}
