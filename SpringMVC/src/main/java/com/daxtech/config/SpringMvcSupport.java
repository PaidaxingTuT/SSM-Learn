package com.daxtech.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class SpringMvcSupport extends WebMvcConfigurationSupport {

    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        //当访问路径静态页面时，不去springMVC容器中找，而是直接去webapp目录下找
        registry.addResourceHandler("/pages/**").addResourceLocations("/pages/");
    }
}
