package spring19aopxuqiutest;

//看电影
public class KanDianYing implements PaiDuia{
        //次要业务
//        public void paiHao(){
//            System.out.println("看电影之前 需要排号");
//        }
        @Override
        public void paiHao() {
            System.out.println("看电影之前 需要排号");
        }

        //主要业务
        public void kanDianYing(){
            System.out.println("看电影，这个是主要业务");
        }
}
