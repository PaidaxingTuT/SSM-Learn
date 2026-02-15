package com.daxtech.springboot.Controller;

import com.daxtech.springboot.Pojo.Result;
import com.daxtech.springboot.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public Result<String> check() {
        String check = bookService.check();
        return Result.success(check);
    }
}

