package spring10basicdizuoye2;

public class Keyboard {
    public Keyboard(){
        System.out.println("键盘出生");
    }
    private Use use;

    public Use getUse() {
        return use;
    }

    public void setUse(Use use) {
        this.use = use;
    }

    public void use(){
        System.out.println("键盘输入");
        use.use();
    }
}
