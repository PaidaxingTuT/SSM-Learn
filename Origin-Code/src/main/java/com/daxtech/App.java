package com.daxtech;

import com.daxtech.service.BookService;
import com.daxtech.service.Imp.BookServiceImp;

public class App {
    public static void main(String[] args) {
        BookService bookService = new BookServiceImp();
        bookService.save(); // 调用 BookServiceImp 的 save 方法
    }
}
