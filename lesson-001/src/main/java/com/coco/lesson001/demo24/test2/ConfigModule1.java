package com.coco.lesson001.demo24.test2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigModule1 {
    @Bean
    public String module1(){
        return "我是模块1配置类！";
    }
}
