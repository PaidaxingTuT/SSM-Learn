package com.daxtech;

import com.daxtech.config.SpringConfig;
import com.daxtech.service.BookService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppForAnnotation {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookService bookService = (BookService) context.getBean(BookService.class);
        bookService.save();
    }
}
