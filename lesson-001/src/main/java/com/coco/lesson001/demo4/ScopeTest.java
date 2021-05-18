package com.coco.lesson001.demo4;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {

    ClassPathXmlApplicationContext context;

    @Before
    public void before(){
        System.out.println("spring容器准备启动。。。。");
        //1.bean配置文件位置
        String beanXml = "classpath:/com/coco/lesson001/demo4/beans.xml";
        //2.创建ClassPathXmlApplicationContext容器，给容器指定需要加载的bean配置文件
        this.context = new ClassPathXmlApplicationContext(beanXml);
        System.out.println("spring容器准备启动完毕！");
    }

    /**
     * 单例bean
     */
    @Test
    public void singletonBean(){
        System.out.println("------------单例bean，每次获取的bean实例都一样-------------");
        System.out.println(context.getBean("singleton"));
        System.out.println(context.getBean("singleton"));
        System.out.println(context.getBean("singleton"));
    }

    /**
     * 多例bean
     */
    @Test
    public void prototypeBean(){
        System.out.println("------------多例bean，每次获取的bean实例都不一样-------------");
        System.out.println(context.getBean("prototypeBean"));
        System.out.println(context.getBean("prototypeBean"));
        System.out.println(context.getBean("prototypeBean"));

    }

}
