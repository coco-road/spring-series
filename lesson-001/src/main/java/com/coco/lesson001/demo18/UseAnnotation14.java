package com.coco.lesson001.demo18;

import org.junit.Test;
import org.springframework.core.annotation.AliasFor;
import org.springframework.core.annotation.AnnotatedElementUtils;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@B14(value = "路人甲Java",a14Value = "通过B14给A14的value参数赋值")
public class UseAnnotation14 {
    @Test
    public void test1(){
        //AnnotatedElementUtils是spring提供的一个查找注解的工具类
        System.out.println(AnnotatedElementUtils.getMergedAnnotation(UseAnnotation14.class, B14.class));
        System.out.println(AnnotatedElementUtils.getMergedAnnotation(UseAnnotation14.class, A14.class));
    }
    /**
     * @com.coco.lesson001.demo18.B14(a14Value=通过B14给A14的value参数赋值, value=路人甲Java)
     * @com.coco.lesson001.demo18.A14(value=通过B14给A14的value参数赋值)
     *
     * @AliasFor(annotation = A14.class, value = "value")
     * 这个相当于给某个注解指定别名，即将B1注解中a14Value参数作为A14中value参数的别名，
     * 当给B1的a14Value设置值的时候，就相当于给A14的value设置值，有个前提是@AliasFor
     * 注解的annotation参数指定的注解需要加载当前注解上面
     */
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface A14{
    String value() default "a";
}


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@A14
@interface B14{
    String value() default "b";

    @AliasFor(annotation = A14.class,value = "value")
    String a14Value();
}