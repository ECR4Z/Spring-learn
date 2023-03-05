package com.ming.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @Author: ECRZ
 * Data:2021-09
 * @Description:
 */
public class Log implements MethodBeforeAdvice {
    // method : 要执行的目标对象的方法
    // objects : 被调用的方法的参数
    // Object : 目标对象
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.printf("%s执行了%s方法！",o.getClass().getName(),method.getName());
    }
}
