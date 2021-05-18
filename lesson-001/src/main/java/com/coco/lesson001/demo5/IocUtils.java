package com.coco.lesson001.demo5;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocUtils {
    public static ClassPathXmlApplicationContext context(String beanXml) {
        return new ClassPathXmlApplicationContext(beanXml);
    }
}
