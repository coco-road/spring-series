package com.coco.lesson001.demo18;

import org.junit.Test;
import org.springframework.core.annotation.AnnotatedElementUtils;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@B1("路人甲Java")
public class UseAnnotation13 {
    @Test
    public void test1(){
        //AnnotatedElementUtils是spring提供的一个查找注解的工具类
        System.out.println(AnnotatedElementUtils.getMergedAnnotation(UseAnnotation13.class,A1.class));
        System.out.println(AnnotatedElementUtils.getMergedAnnotation(UseAnnotation13.class,B1.class));

        /**
         * @com.coco.lesson001.demo18.A1(value=a)
         * @com.coco.lesson001.demo18.B1(value=路人甲Java)
         *
         * 此时有个问题：此时如果想在UseAnnotation13上给B1上的A1注解设置值是没有办法的，
         * 注解定义无法继承导致的，如果注解定义上面能够继承，那用起来会爽很多，
         * spring通过@Aliasfor方法解决了这个问题。
         */
    }
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface A1{
    String value() default "a";
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@A1
@interface B1{
    String value() default "b";
}
