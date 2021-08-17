package com.coco.lesson001.demo18;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Ann3("我是路人甲java")
public class UseAnnotation3 {
}

/**
 * 一个参数为value的注解，可以省略参数名称
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Ann3{
    String value();
}