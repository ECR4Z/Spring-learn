package com.ming.util;

import org.junit.jupiter.api.Test;

/**
 * @Author: ECRZ
 * Data:2021-09
 * @Description:
 */
public class Polymorphism {
    @Test
    public void test(){
        User user = new User();
        Wang wang = new Wang();
        User um = new Wang();

        //多态:方法用子类，属性用自己
        System.out.printf("名字：%s,年龄：%d\n",user.name,user.age);
        user.doSomething();

        System.out.printf("名字：%s,年龄：%d\n",wang.name,wang.age);
        wang.doSomething();

        System.out.printf("名字：%s,年龄：%d\n",um.name,um.age);
        um.doSomething();
    }
}

class User{
    public String name = "user";
    public int age = 29;
    public void doSomething(){
        System.out.println("user do something!\n");
    }
}

class Wang extends User{
    public String name = "wang";
    public int age = 18;
    public void doSomething(){
        System.out.println("wang do something!\n");
    }
}



