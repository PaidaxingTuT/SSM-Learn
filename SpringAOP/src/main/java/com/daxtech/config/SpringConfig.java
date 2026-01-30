package com.daxtech.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.daxtech")
@EnableAspectJAutoProxy //用注解开发开启AOP功能
public class SpringConfig {
}
