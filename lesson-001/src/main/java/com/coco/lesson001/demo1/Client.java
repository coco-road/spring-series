package com.coco.lesson001.demo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * demo1手敲的过程中发现
 * resources里面的文件夹不能一次级联创建，需要一个层级一个层级的创建
 */
public class Client {
    public static void main(String[] args) {
        //1、bean配置文件位置
        String xmlPath = "classpath:/com/coco/lesson001/demo1/bean.xml";
        //2、创建ClassPathXmlApplicationContext容器，给容器指定需要加载的bean配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(xmlPath);
        //3、从容获取需要的bean
        HelloWorld helloWorld = context.getBean("helloWorld",HelloWorld.class);
        //4、使用对象
        helloWorld.say();
    }
}
