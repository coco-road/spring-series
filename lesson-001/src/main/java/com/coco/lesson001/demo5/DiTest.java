package com.coco.lesson001.demo5;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DiTest {
    /**
     * 通过构造器的参数位置注入
     */
    @Test
    public void diByConstructorParamIndex() {
        String beanXml = "classpath:/com/coco/lesson001/demo5/diByConstructorParamIndex.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);
        System.out.println(context.getBean("diByConstructorParamIndex"));
    }

    /**
     * 通过构造器的参数类型注入
     */
    @Test
    public void diByConstructorParamType() {
        String beanXml = "classpath:/com/coco/lesson001/demo5/diByConstructorParamType.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);
        System.out.println(context.getBean("diByConstructorParamType"));
    }

    /**
     * 通过构造器的参数名称注入
     */
    @Test
    public void diByConstructorParamName() {
        String beanXml = "classpath:/com/coco/lesson001/demo5/diByConstructorParamName.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);
        System.out.println(context.getBean("diByConstructorParamName"));
    }

    /**
     * 通过setter方法注入
     */
    @Test
    public void diBySetter() {
        String beanXml = "classpath:/com/coco/lesson001/demo5/diBySetter.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);
        System.out.println(context.getBean("diBySetter"));
    }

    @Test
    public void diBean(){
        String beanXml = "classpath:/com/coco/lesson001/demo5/diBean.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);
        System.out.println(context.getBean("diBeanByConstructor"));
        System.out.println(context.getBean("diBeanBySetter"));
    }

    @Test
    public void diOtherType() {
        String beanXml = "classpath:/com/coco/lesson001/demo5/diOtherType.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);
        System.out.println(context.getBean("diOtherType"));
    }

}
