package com.coco.lesson001.demo9;

import com.coco.lesson001.demo5.IocUtils;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireCandidateTest {
    @Test
    public void setterBean() {
        String beanXml = "classpath:/com/coco/lesson001/demo9/autowireCandidateBean.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);
        System.out.println(context.getBean(SetterBean.class)); //@1

        SetterBean.IService service = context.getBean(SetterBean.IService.class); //@2
        System.out.println(service);
    }
}
