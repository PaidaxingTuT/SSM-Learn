package com.daxtech;

import com.daxtech.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
    public static void main(String[] args) {
        //获取IOC容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取Bean
        BookService bookService = (BookService) context.getBean("service");

        bookService.save();
    }
}
