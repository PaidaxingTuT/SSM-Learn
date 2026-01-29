package com.daxtech.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.daxtech")
@PropertySource("book.properties")
public class SpringConfig {
}
