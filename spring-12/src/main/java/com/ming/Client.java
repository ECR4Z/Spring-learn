package com.ming;

/**
 * @Author: ECRZ
 * Data:2021-09
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        OperationImpl operation = new OperationImpl();
        OperationProxy proxy = new OperationProxy();
        proxy.setOperation(operation);
        proxy.add();
    }
}
