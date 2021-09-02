package spring16aopjingtaidaili;

//目标对象， 他的方法不行 ，想让另一个 对象帮他
public class Game {
    private int wangSu = 460;

    public int getWangSu() {
        return wangSu;
    }

    public void setWangSu(int wangSu) {
        this.wangSu = wangSu;
    }

    //目标对象的目的：   连接网速，目标对象本身的方法是不行的，想要在不改变这个源代码的基础上，增强这个方法。
    public void conNet(){
        System.out.println("游戏本身的网速是：" + this.getWangSu());
    }
}
