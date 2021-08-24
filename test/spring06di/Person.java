package spring06di;
//人 是我们的 主体 ,主要的 类,他需要依赖手机
public class Person {
    public Person(){
        System.out.println("人在容器中诞生");
    }
    //接口都是抽象的
    private PlayGame playGame;

    public PlayGame getPlayGame() {
        return playGame;
    }

    public void setPlayGame(PlayGame playGame) {
        this.playGame = playGame;
    }
    //    private Phone phone;//人 依赖了手机,所以 人就拥有了手机
//    private Psp psp;

//    public Psp getPsp() {
//        return psp;
//    }
//
//    public void setPsp(Psp psp) {
//        this.psp = psp;
//    }
//
//    public Phone getPhone() {
//        return phone;
//    }
//
//    public void setPhone(Phone phone) {  //set是暴露给别人看的,让别人给你东西的
//        this.phone = phone;
//    }

    public void play(){
        System.out.println("人玩的方法  玩手机");
        playGame.game();
//        psp.game();
//        phone.game();
    }
}
