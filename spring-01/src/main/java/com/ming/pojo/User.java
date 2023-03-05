package com.ming.pojo;

/**
 * @Author: ECRZ
 * Data:2021-09
 * @Description:
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showInfo(){
        System.out.printf("Hello,I am %s!",name);
    }
}
