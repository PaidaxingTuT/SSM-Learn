package com.daxtech;

import com.daxtech.config.SpringConfig;
import com.daxtech.service.BookService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppForAnnotation {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        //BookMapper bookMapper = (BookMapper) context.getBean("bookMapper");
        BookService bookService1 = (BookService) context.getBean(BookService.class);
        BookService bookService2 = (BookService) context.getBean(BookService.class);
        //System.out.println(bookMapper);
        System.out.println(bookService1);
        System.out.println(bookService2);
        context.close();
    }
}
