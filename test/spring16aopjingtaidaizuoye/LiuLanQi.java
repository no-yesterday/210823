package spring16aopjingtaidaizuoye;

public class LiuLanQi {
    private Boolean  google=false;

    public Boolean getGoogle() {
        return google;
    }

    public void setGoogle(Boolean google) {
        this.google = google;
    }

    public void Fangwen(){
        System.out.println(" 浏览器不能访问谷歌:" + this.getGoogle());
    }
}
