package com.coco.lesson001.demo24.test2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigModule2 {
    @Bean
    public String module2(){
        return "我是模块2配置类！";
    }
}
