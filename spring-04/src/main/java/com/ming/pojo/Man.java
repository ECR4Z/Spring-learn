package com.ming.pojo;

/**
 * @Author: ECRZ
 * Data:2021-09
 * @Description:
 */
public class Man {
    private String name;

    public Man(){

    }

    public Man(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("name = " + this.name);
    }
}
