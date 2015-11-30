package com.souche.sp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 静态页面控制器
 * Created by liuqizhe on 15/11/30.
 */
@Controller
@RequestMapping("/static")
public class StaticPageController {
    /**
     * 前往帮助页面
     * @return
     */
    @RequestMapping("/help")
    public String help() {
        return "StaticPage/help" ;
    }

    /**
     * 前往主页
     * @return
     */
    @RequestMapping("/home")
    public String home() {
        return "StaticPage/home" ;
    }

    /**
     * 前往关于页面
     * @return
     */
    @RequestMapping("/about")
    public String about() {
        return "StaticPage/about" ;
    }
}
