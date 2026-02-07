package com.daxtech.controller;

import com.daxtech.pojo.user;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("/users")
public class UserController {


    @RequestMapping(value = "/{age}", method = RequestMethod.POST)
    public user post(@PathVariable Integer age) {
        user user = new user();
        user.setName("post");
        user.setAge(age);
        return user;
    }

    @RequestMapping(value = "/{age}", method = RequestMethod.DELETE)
    public user delete(@PathVariable Integer age) {
        user user = new user();
        user.setName("delete");
        user.setAge(age);
        return user;
    }

    @RequestMapping(value = "/{age}", method = RequestMethod.PUT)
    public user put(@PathVariable Integer age) {
        user user = new user();
        user.setName("put");
        user.setAge(age);
        return user;
    }

    @RequestMapping(value = "/{age}", method = RequestMethod.GET)
    public user get(@PathVariable Integer age) {
        user user = new user();
        user.setName("get");
        user.setAge(age);
        return user;
    }
}
