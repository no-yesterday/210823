package spring17aopdongtaidailizuoye;

public class LiuLanQi2 implements Vpn{

    private Boolean  google=false;

    public Boolean getGoogle() {
        return google;
    }

    public void setGoogle(Boolean google) {
        this.google = google;
    }

    @Override
    public Boolean fangWen() {
        System.out.println(" 浏览器不能访问谷歌:" + google);
        return this.getGoogle();
    }
}
