package spring18aopcglibdongtaidaili;

import org.junit.Test;

public class ManTest {
    @Test
    public void test01(){
        Man erZi = new CglibFactory().cglibCreator();//多态中的 父类 指向 子类对象，本质是儿子的对象
        int score = erZi.dream();
        System.out.println("score = " + score);
    }
}
