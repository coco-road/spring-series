package com.coco.lesson001.demo8;

import com.coco.lesson001.demo5.IocUtils;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrimaryTest {
    @Test
    public void normalBean() {
        String beanXml = "classpath:/com/coco/lesson001/demo8/normalBean.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);
        //下面我们通过spring容器的T getBean(Class<T> requiredType)方法获取容器中对应的bean
        NormalBean.IService service = context.getBean(NormalBean.IService.class); //@1
        System.out.println(service);
    }

    @Test
    public void setterBean() {
        String beanXml = "classpath:/com/coco/lesson001/demo8/setterBean.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);
    }

    @Test
    public void primaryBean() {
        String beanXml = "classpath:/com/coco/lesson001/demo8/primaryBean.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);
        PrimaryBean.IService service = context.getBean(PrimaryBean.IService.class); //@1
        System.out.println(service);
        PrimaryBean primaryBean = context.getBean(PrimaryBean.class); //@2
        System.out.println(primaryBean);
    }

    @Test
    public void StringTform(){
        System.out.println(String.format("%02d", 1));
        System.out.println(String.format("%02d", 10));
        System.out.println(String.format("%02d", 100));
        System.out.println(String.format("%02d", 1000));
        System.out.println(String.format("%02d", 10000));
    }
}
