package spring19aopxuqiutest;


//海底捞
public class HaiDiLao implements PaiDuia{
    //次要业务
//    public void paiHao(){
//        System.out.println("吃饭之前 需要排号");
//    }
    @Override
    public void paiHao() {
        System.out.println("吃饭之前 需要排号");
    }

    //主要业务
    public void ganHuoGuo(){
        System.out.println("吃火锅，这个是主要业务");
    }
}
