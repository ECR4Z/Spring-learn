package com.ming.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @Author: ECRZ
 * Data:2021-09
 * @Description:
 */
@Aspect
public class AnnotationPointCut {
    @Before("execution(* com.ming.userService.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("执行前");
    }
    @After("execution(* com.ming.userService.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("执行后");
    }
    @Around("execution(* com.ming.userService.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint joinPoint)throws Throwable{
        System.out.println("环绕前");
        System.out.println("签名："+joinPoint.getSignature());
        Object proceed = joinPoint.proceed();
        System.out.println("环绕后");
        System.out.println(proceed);
    }
}
