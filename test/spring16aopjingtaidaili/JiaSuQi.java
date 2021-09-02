package spring16aopjingtaidaili;

/**
 * 代理对象， 用于增强目标对象的方法
 *   游戏   迅游加速器
 *    王宝强   宋喆
 *    浏览器   vpn
 *    被告人   律师
 *
 *    请问，谁依赖了谁？ 谁拥有了谁？ 谁应该注入谁的类中？
 *    谁是主体类？谁是辅助类？
 */
public class JiaSuQi {
    private Game game;  //代理类才是主体类  ，代理对象 依赖了 木匾对象， 代理对象包含了目标对象
    private int ws;

    //代理对象的方法，而且必须 和 目标对象一样，因为 代理对象也要目标对象的方法，不然 怎么加强
    public void conNet(){
        //这个方法 要 承接 目标对象的方法
        int wangSu = game.getWangSu();//目标对象的 网速 方法
        this.ws = wangSu-400;
        System.out.println("this.ws = " + this.ws);
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public int getWs() {
        return ws;
    }

    public void setWs(int ws) {
        this.ws = ws;
    }
}
