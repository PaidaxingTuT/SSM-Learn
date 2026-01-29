package com.daxtech;

import com.daxtech.mapper.BookMapper;
import com.daxtech.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookMapper bookMapper = (BookMapper) context.getBean("bookMapper");
        BookService bookService = (BookService) context.getBean(BookService.class);
        System.out.println(bookMapper);
        System.out.println(bookService);

    }
}
