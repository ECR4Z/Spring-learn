package com.ming.pojo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

import java.io.File;

/**
 * @Author: ECRZ
 * Data:2021-09
 * @Description:
 */
@Configuration
@Import(MyConfig.class)
public class MyConfig2 {
    @Bean
    public Dog dog1(){ return new Dog(); }
}
