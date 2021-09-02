package spring16aopjingtaidaizuoye;

public class Vpn {
    private LiuLanQi liuLanQi;
    private Boolean Fw;

    public void Fangwen(){
        //这个方法 要承接  目标对象的方法
        Boolean fangw=liuLanQi.getGoogle();
        this.Fw=true;
        System.out.println("用vpn才能访问谷歌浏览器:" + this.Fw);
    }

    public LiuLanQi getLiuLanQi() {
        return liuLanQi;
    }

    public void setLiuLanQi(LiuLanQi liuLanQi) {
        this.liuLanQi = liuLanQi;
    }

    public Boolean getFw() {
        return Fw;
    }

    public void setFw(Boolean fw) {
        Fw = fw;
    }
}
