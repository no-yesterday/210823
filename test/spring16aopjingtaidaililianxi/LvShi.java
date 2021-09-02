package spring16aopjingtaidaililianxi;

public class LvShi {
    private BeiGaoRen beiGaoRen;
    private int falv;

    public void faLv(){
        System.out.println("法律知识不行");
        //这个方法 要 承接 目标对象的方法
        int zhiShi = beiGaoRen.getZhiShi();//目标对象的 网速 方法
        this.falv = zhiShi + 50;
        System.out.println("请律师后的法律知识 = " + this.falv);
    }

    public BeiGaoRen getBeiGaoRen() {
        return beiGaoRen;
    }

    public void setBeiGaoRen(BeiGaoRen beiGaoRen) {
        this.beiGaoRen = beiGaoRen;
    }

    public int getFalv() {
        return falv;
    }

    public void setFalv(int falv) {
        this.falv = falv;
    }
}
