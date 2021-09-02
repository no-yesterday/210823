package spring19aopxuqiu;

/**
 * 这个类 就是 切面类       切面类 和 普通类 有什么区别
 * 1.逻辑上的区别？  切面类就是 次要业务 ，而普通类可能是 主要业务
 * 2.写法上的区别， 一般切面类 里面很少有属性 ，只有方法
 *
 * //讲到这里 我们要 晋级！！    切面类 就是  通知。
 * //
 */
public class PaiDui {
    public static void paiHao(){
        System.out.println("排队");
    }
}
