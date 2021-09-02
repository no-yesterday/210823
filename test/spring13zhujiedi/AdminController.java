package spring13zhujiedi;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class AdminController {
    @Resource
    private AdminService adminService;//接口的调用   面向抽象的

    //查询全部的方法
    public void selectAll(){
        //controller 层 service 层  -- 即 controller 层依赖了 service 层
        adminService.selectAll();
    }
}
