package spring13zhujiedi;

import org.springframework.stereotype.Repository;

@Repository
public class AdminDao {
    public void selectAll(){
        System.out.println("我是dao层 ，我负责 增删改查");
    }
}
