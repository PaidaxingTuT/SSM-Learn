package com.daxtech;

import com.daxtech.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
    public static void main(String[] args) {
        //获取IOC容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取Bean
        BookService bookService = (BookService) context.getBean("service");

        bookService.save();
        //context.close();//关闭容器。暴力关闭，只能放在最后，不推荐使用
        context.registerShutdownHook(); //注册关闭钩子, JVM关闭时关闭容器，可以放在任意位置
    }
}
