package com.coco.lesson001.demo14;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReplacedMethodTest {
    @Test
    public void replacedmethod() {
        String beanXml = "classpath:/com/coco/lesson001/demo14/replacedmethod.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(beanXml);

        System.out.println(context.getBean(ServiceA.class)); //@1
        System.out.println(context.getBean(ServiceA.class)); //@2

        System.out.println("serviceB中的serviceA");
        ServiceB serviceB = context.getBean(ServiceB.class); //@3
        serviceB.say();
        serviceB.say();
    }
}
