package com.daxtech.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {

    @Pointcut("execution(void com.daxtech.mapper.BookMapper.update())")
    public void pt(){

    }

    /*@Before("pt()")
    public void method(){
        System.out.println(System.currentTimeMillis());
    }*/

    @Around("pt()")
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("begin");
        pjp.proceed();
        System.out.println("end");
    }

    // Before 之前
    // After 之后
    // Around 前后
    // AfterReturning 返回之后
    // AfterThrowing 异常之后

}
