package spring19aopxuqiu;

//经过上述的推论 静态方法  和 接口 都被 推翻了
//把
public class BankServiceImpl implements BankService {

    @Override
    public void cunQian(){
        System.out.println("存钱");
    }
}
