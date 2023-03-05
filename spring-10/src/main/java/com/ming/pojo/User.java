package com.ming.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author: ECRZ
 * Data:2021-09
 * @Description:
 */
@Component("user")
//以上注解等价于<bean id="user" class="com.ming.pojo.User"/>
public class User {
    public String name = "张三";

    @Value("唱歌")
    //相当于在配置文件中配置了属性如:<property name = "hobby" value = "唱歌"/>
    public String hobby;

    public char sex;

    @Value("男")
    public void setSex(char sex) {
        this.sex = sex;
    }
}
