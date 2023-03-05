package com.ming;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: ECRZ
 * Data:2021-09
 * @Description:
 */
public class ProxyInvocationHandler implements InvocationHandler {
    private OperationImpl operation;

    public void setOperation(OperationImpl operation) {
        this.operation = operation;
    }

    //创建代理类
    /*
    loader：一个classloader对象，定义了由哪个classloader对象对生成的代理类进行加载
    interfaces：一个interface对象数组，表示我们将要给我们的代理对象提供一组什么样的接口，如果我们提供了这样一个接口对象数组，那么也就是声明了代理类实现了这些接口，代理类就可以调用接口中声明的所有方法。
    h：一个InvocationHandler对象，表示的是当动态代理对象调用方法的时候会关联到哪一个InvocationHandler对象上，并最终由其调用。
    */
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), operation.getClass().getInterfaces(), this);
    }

    //当代理类被调用时，自动调用invoke方法；
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理类："+proxy.getClass().getName());
        System.out.println("调用了" + method.getName() + "方法");
        Object obj = method.invoke(operation, args);
        return obj;
    }
}
