package com.zy.cn.controller;

import com.zy.cn.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;

@Controller
@RequestMapping("/user")
public class TestUserContext {



    @RequestMapping(value = "/user",method = RequestMethod.POST)
    //@PostMapping
    @ResponseBody
    public String config(String name)
    {

        System.out.println("=-=-=-=-");
        System.out.println(name);

        return "String user";

    }


}
