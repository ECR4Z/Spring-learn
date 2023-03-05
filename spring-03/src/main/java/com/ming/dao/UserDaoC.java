package com.ming.dao;

/**
 * @Author: ECRZ
 * Data:2021-09
 * @Description:
 */
public class UserDaoC implements UserDao{
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void doSomething() {
        System.out.printf("Hello i am C,type is %s\n",type);
    }
}
