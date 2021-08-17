package com.coco.lesson001.demo12;

import org.junit.Test;
import org.springframework.beans.BeanUtils;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanExtendTest {
    @Test
    public void normalBean() {
        String beanXml = "classpath:/com/coco/lesson001/demo12/normalBean.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(beanXml);
        System.out.println("serviceB:" + context.getBean(ServiceB.class));
        System.out.println("serviceC:" + context.getBean(ServiceC.class));
    }

    @Test
    public void extendBean() {
        String beanXml = "classpath:/com/coco/lesson001/demo12/extendBean.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(beanXml);
        System.out.println("serviceB:" + context.getBean(ServiceB.class));
        System.out.println("serviceC:" + context.getBean(ServiceC.class));

        //Error creating bean with name 'baseService': Bean definition is abstract
        //System.out.println(context.getBean("baseService"));
    }

    @Test
    public void testCopyProperties(){
        ServiceC orig = new ServiceC();
        orig.setName("orig-->");
        System.out.println(orig);
        ServiceC dest = new ServiceC();
        BeanUtils.copyProperties(orig,dest);
        System.out.println(orig);
        System.out.println(dest);
        ServiceB third = new ServiceB();
        BeanUtils.copyProperties(dest,third);
        System.out.println(third);
    }

    @Test
    public void testCopyProperties2(){
        ServiceB orig = new ServiceB();
        orig.setCopy("copy");
        System.out.println(orig);
        ServiceC dest = new ServiceC();
        BeanUtils.copyProperties(orig,dest);
        System.out.println(orig);
        System.out.println(dest);
        dest.setName("name");
        ServiceB third = new ServiceB();
        BeanUtils.copyProperties(dest,third);
        System.out.println(third);
        BeanUtils.copyProperties(orig,third);
        System.out.println(third);
    }

}
