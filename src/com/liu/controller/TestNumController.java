package com.liu.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestNumController implements Controller {   //注意包名

    //controller 中 有个 方法 叫做 模型和视图  意思是 把 视图和模型绑定到一起了
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        System.out.println("我是模型和视图");
        System.out.println("注意要写的前端的视图名称一样");
        ModelAndView modelAndView = new ModelAndView("test02");
        return modelAndView;
    }
}
