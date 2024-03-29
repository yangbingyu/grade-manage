package com.example.grademanage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"/", "/index"})
    public String index() {
        return "index";
    }

    @RequestMapping("/service/{path}")
    public String service(@PathVariable("path") String path) {
        return "service/" + path;
    }


    /**
     * 登录视图转跳
     *
     * @return 登录视图
     */
    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    /**
     * 403 页面
     *
     * @return 403视图
     */
    @RequestMapping("/403")
    public String _403() {
        return "403";
    }

}