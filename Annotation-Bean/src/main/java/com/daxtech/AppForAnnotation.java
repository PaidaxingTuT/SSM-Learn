package com.daxtech;

import com.daxtech.config.SpringConfig;
import com.daxtech.mapper.BookMapper;
import com.daxtech.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppForAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookMapper bookMapper = (BookMapper) context.getBean("bookMapper");
        BookService bookService = (BookService) context.getBean(BookService.class);
        System.out.println(bookMapper);
        System.out.println(bookService);
    }
}
