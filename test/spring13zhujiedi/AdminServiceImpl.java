package spring13zhujiedi;

import org.springframework.beans.factory.annotation.Autowired;

public class AdminServiceImpl implements AdminService{
//    @Resource //相当于 我们的 xml 中的 注入  注解1： tomcat 提供的 byName
    @Autowired //注解2： spring提供的，多用spring 体系 byType
    private AdminDao adminDao;

    @Override
    public void selectAll() {
        //service 层 调用 dao 层，service 层 依赖了 dao 层
    }
}
