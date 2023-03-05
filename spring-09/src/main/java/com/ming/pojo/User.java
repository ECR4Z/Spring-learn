package com.ming.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

/**
 * @Author: ECRZ
 * Data:2021-09
 * @Description:
 */
public class User {
    //@Autowired(required=false) 说明： false，对象可以为null；true，对象必须存对象，不能为null。
    //@Autowired是根据类型自动装配的，加上@Qualifier则可以根据byName的方式自动装配
    //@Qualifier不能单独使用。
    //@Autowired先byType，@Resource先 byName。
    @Autowired(required = false)
    @Qualifier(value = "cat1")
    private Cat cat;
    @Resource(name = "dog1")
    private Dog dog;
    private String name;

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
