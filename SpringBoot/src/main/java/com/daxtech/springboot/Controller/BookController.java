package com.daxtech.springboot.Controller;

import com.daxtech.springboot.Mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookMapper bookMapper;

    @GetMapping
    public String check() {
        System.out.println(bookMapper.selectList(null));
        return "success";
    }
}

