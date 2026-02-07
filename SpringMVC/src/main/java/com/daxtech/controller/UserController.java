package com.daxtech.controller;

import com.daxtech.pojo.user;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {


    @RequestMapping(value = "/users/{age}", method = RequestMethod.POST)
    @ResponseBody
    public user post(@PathVariable Integer age) {
        user user = new user();
        user.setName("post");
        user.setAge(age);
        return user;
    }

    @RequestMapping(value = "/users/{age}", method = RequestMethod.DELETE)
    @ResponseBody
    public user delete(@PathVariable Integer age) {
        user user = new user();
        user.setName("delete");
        user.setAge(age);
        return user;
    }

    @RequestMapping(value = "/users/{age}", method = RequestMethod.PUT)
    @ResponseBody
    public user put(@PathVariable Integer age) {
        user user = new user();
        user.setName("put");
        user.setAge(age);
        return user;
    }

    @RequestMapping(value = "/users/{age}", method = RequestMethod.GET)
    @ResponseBody
    public user get(@PathVariable Integer age) {
        user user = new user();
        user.setName("get");
        user.setAge(age);
        return user;
    }
}
