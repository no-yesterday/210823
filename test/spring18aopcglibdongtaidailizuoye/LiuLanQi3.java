package spring18aopcglibdongtaidailizuoye;
//浏览器类  用CGlib的代理模式
public class LiuLanQi3 {
    private Boolean  google=false;

    public Boolean getGoogle() {
        return google;
    }

    public void setGoogle(Boolean google) {
        this.google = google;
    }

    public Boolean fangWen(){
        System.out.println(" 浏览器不能访问谷歌:" + google);
        return this.getGoogle();
    }
}
