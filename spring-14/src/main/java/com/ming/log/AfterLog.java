package com.ming.log;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @Author: ECRZ
 * Data:2021-09
 * @Description:
 */
public class AfterLog implements AfterReturningAdvice {
    // o 返回值
    // method被调用的方法
    // objects 被调用的方法的对象的参数
    // o1 被调用的目标对象
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.printf("%s执行了%s方法，返回值为%s",o1.getClass().getName(),method.getName(),o);
    }
}
