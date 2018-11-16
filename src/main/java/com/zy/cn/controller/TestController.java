package com.zy.cn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@Controller
public class TestController {

    @ResponseBody
    @RequestMapping("/test")
    public String getString(){
        System.out.println("=========");
        return "zhongguo~~~~~";
    }
}
