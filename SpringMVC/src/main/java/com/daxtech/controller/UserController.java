package com.daxtech.controller;

import com.daxtech.pojo.user;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @RequestMapping("/save")
    @ResponseBody
    public String save(@RequestParam String likes){
        System.out.println(likes);
        return "{likes:"+likes+"}";
    }

    @RequestMapping(value = "/users/{age}",method = RequestMethod.POST)
    @ResponseBody
    public user toJson(@PathVariable Integer age) {
        user user = new user();
        user.setName("daxtech");
        user.setAge(age);
        return user;
    }
}
