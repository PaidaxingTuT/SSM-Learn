package com.daxtech.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class MyAdvice {

    @Pointcut("execution(* com.daxtech.mapper.*.*(..))")
    public void pt(){

    }

    //@Before("pt()")
    public void method(JoinPoint jp){
        Object[] args = jp.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println(System.currentTimeMillis());
    }

    @Around("pt()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        System.out.println(Arrays.toString(args)); //10

        args[0]=1000;
        System.out.println("begin");
        Object proceed = pjp.proceed(args); //1000
        System.out.println("end");
        return proceed;
    }

    // Before 之前
    // After 之后
    // Around 前后
    // AfterReturning 返回之后
    // AfterThrowing 异常之后

}
