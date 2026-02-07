package com.daxtech.controller;

import com.daxtech.pojo.user;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @RequestMapping("/save")
    @ResponseBody
    public String save(@RequestParam String likes){
        System.out.println(likes);
        return "{likes:"+likes+"}";
    }

    @RequestMapping(value = "/users",method = RequestMethod.POST)
    @ResponseBody
    public user toJson() {
        user user = new user();
        user.setName("daxtech");
        user.setAge(18);
        return user;
    }
}
