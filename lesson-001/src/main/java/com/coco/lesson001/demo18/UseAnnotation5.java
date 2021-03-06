package com.coco.lesson001.demo18;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Ann5(age = 32,address ="上海" )
public class UseAnnotation5 {
}

/**
 * 为参数指定默认值
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Ann5{
    String[] name() default {"路人甲java", "spring系列"};
    int[] score() default 1;
    int age() default 30;
    String address();
}
