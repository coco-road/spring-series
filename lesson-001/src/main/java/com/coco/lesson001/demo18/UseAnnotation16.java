package com.coco.lesson001.demo18;

import org.junit.Test;
import org.springframework.core.annotation.AliasFor;
import org.springframework.core.annotation.AnnotatedElementUtils;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@B16(name="我是v1")
public class UseAnnotation16 {

    /**
     * 当@AliasFor中不指定value或者attribute的时候，
     * 自动将@AliasFor修饰的参数作为value和attribute的值，
     * 如下@AliasFor注解的value参数值为name
     *
     */
    @Test
    public void test1() throws NoSuchFieldException {
        //AnnotatedElementUtils是spring提供的一个查找注解的工具类
        System.out.println(AnnotatedElementUtils.getMergedAnnotation(UseAnnotation16.class, A16.class));
        System.out.println(AnnotatedElementUtils.getMergedAnnotation(UseAnnotation16.class, B16.class));
    }
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface A16{
    String name() default "a";
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@A16
@interface B16{
    @AliasFor(annotation = A16.class) //@5
    String name() default "b";//@2
}