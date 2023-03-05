package com.ming.dao;

/**
 * @Author: ECRZ
 * Data:2021-09
 * @Description:
 */
public class UserDaoJava implements UserDao{
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void doSomething() {
        System.out.printf("Hello i am Java,type is %s\n",type);
    }
}
