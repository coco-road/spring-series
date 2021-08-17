package com.coco.lesson001.demo11;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LazyBeanTest {
    @Test
    public void actualTimeBean() {
        System.out.println("spring容器启动中...");
        String beanXml = "classpath:/com/coco/lesson001/demo11/actualTimeBean.xml";
        new ClassPathXmlApplicationContext(beanXml); //启动spring容器
        System.out.println("spring容器启动完毕...");
    }

    @Test
    public void lazyInitBean() {
        System.out.println("spring容器启动中...");
        String beanXml = "classpath:/com/coco/lesson001/demo11/lazyInitBean.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(beanXml); //启动spring容器
        System.out.println("spring容器启动完毕...");
        System.out.println("从容器中开始查找LazyInitBean");
        LazyInitBean lazyInitBean = context.getBean(LazyInitBean.class);
        System.out.println("LazyInitBean:" + lazyInitBean);
    }


    @Test
    public void actualTimeDependencyLazyBean() {
        System.out.println("spring容器启动中...");
        String beanXml = "classpath:/com/coco/lesson001/demo11/actualTimeDependencyLazyBean.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(beanXml); //启动spring容器
        System.out.println("spring容器启动完毕...");
        //actualTimeDependencyLazyBean增加lazyInit=false测试
        context.getBean("actualTimeDependencyLazyBean");
    }

}
