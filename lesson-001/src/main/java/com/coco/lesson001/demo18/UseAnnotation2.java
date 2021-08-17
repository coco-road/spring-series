package com.coco.lesson001.demo18;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Ann2(name = "我是路人甲java")
public class UseAnnotation2 {
}

/**
 * 一个参数的注解
 * 注解属性费value时需要有默认值，没有则使用时必须指定
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Ann2{
    String name();
}