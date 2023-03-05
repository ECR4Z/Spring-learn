package com.ming;

/**
 * @Author: ECRZ
 * Data:2021-09
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        //创建实现类
        OperationImpl operation = new OperationImpl();
        ProxyInvocationHandler proxy = new ProxyInvocationHandler();
        proxy.setOperation(operation);
        //创建代理类
        Operation operation1 = (Operation) proxy.getProxy();
        //代理执行接口方法,会自动调用invoke方法
        operation1.add();
    }
}
