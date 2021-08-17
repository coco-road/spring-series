package com.coco.lesson001.demo25.test1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig1 {

    @Bean
    @Conditional(OnMissingBeanCondition.class)
    public IService service1(){
        return new Service1();
    }



}
