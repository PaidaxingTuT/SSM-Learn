package com.daxtech.controller;

import com.daxtech.pojo.user;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {


    //@RequestMapping(value = "/{age}", method = RequestMethod.POST)
    @PostMapping("/{age}")
    public user post(@PathVariable Integer age) {
        user user = new user();
        user.setName("post");
        user.setAge(age);
        return user;
    }

    //@RequestMapping(value = "/{age}", method = RequestMethod.DELETE)
    @DeleteMapping("/{age}")
    public user delete(@PathVariable Integer age) {
        user user = new user();
        user.setName("delete");
        user.setAge(age);
        return user;
    }

    //@RequestMapping(value = "/{age}", method = RequestMethod.PUT)
    @PutMapping("/{age}")
    public user put(@PathVariable Integer age) {
        user user = new user();
        user.setName("put");
        user.setAge(age);
        return user;
    }

    //@RequestMapping(value = "/{age}", method = RequestMethod.GET)
    @GetMapping("/{age}")
    public user get(@PathVariable Integer age) {
        user user = new user();
        user.setName("get");
        user.setAge(age);
        return user;
    }
}
