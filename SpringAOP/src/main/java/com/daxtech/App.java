package com.daxtech;

import com.daxtech.config.SpringConfig;
import com.daxtech.mapper.BookMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookMapper bookMapper = context.getBean(BookMapper.class);
        bookMapper.num(10);
    }
}
