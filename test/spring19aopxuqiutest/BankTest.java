package spring19aopxuqiutest;

import org.junit.Test;

public class BankTest {

    //为什么要用到 主要业务和次要业务,为晒要把 次要业务提取出来
    @Test
    public void test01(){

        //测试
        Bank bank = new Bank();
        bank.paiHao();
        bank.quKuan();

        HaiDiLao haiDiLao = new HaiDiLao();
        haiDiLao.paiHao();
        haiDiLao.ganHuoGuo();

    }
}
