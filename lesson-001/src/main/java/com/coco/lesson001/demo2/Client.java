package com.coco.lesson001.demo2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {

        //1、bean配置文件位置
        String xmlPath = "classpath:/com/coco/lesson001/demo2/bean.xml";
        //2、创建ClassPathXmlApplicationContext容器，给容器指定需要加载的bean配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(xmlPath);

        for (String beanName: Arrays.asList("user1","user2","user3","user4","user5")){
            String[] aliases = context.getAliases(beanName);
            System.out.println(String.format("beanName:%s,别名:[%s]",beanName,String.join(",",aliases)));
        }

        System.out.println("=========================================");

        for(String beanName:context.getBeanDefinitionNames()){
            String[] aliases = context.getAliases(beanName);
            System.out.println(String.format("beanName:%s,别名:[%s]",beanName,String.join(",",aliases)));
        }
    }
}
