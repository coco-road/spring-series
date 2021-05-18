package com.coco.lesson001.demo4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.TimeUnit;

public class ThreadScopeTest {

    public static void main(String[] args) throws InterruptedException {
        String beanXml = "classpath:/com/coco/lesson001/demo4/bean-thread.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext();
        context.setConfigLocation(beanXml);
        context.refresh();
        context.getBeanFactory().registerScope(ThreadScope.THREAD_SCOPE, new ThreadScope());//@1

        for (int i = 0; i < 2; i++) {
            System.out.println("i="+i);
            new Thread(()->{
                System.out.println("Thread name="+Thread.currentThread().getName());
                System.out.println(Thread.currentThread().getName()+","+context.getBean("threadBean"));
                System.out.println(Thread.currentThread().getName()+","+context.getBean("threadBean"));
            }).start();
            TimeUnit.SECONDS.sleep(2);
        }
    }
}
