package com.coco.lesson001.demo18;

import org.junit.Test;
import org.springframework.core.annotation.AliasFor;
import org.springframework.core.annotation.AnnotatedElementUtils;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@A15(v1 = "我是v1")
public class UseAnnotation15 {
    @A15(v2 = "我是v2")
    private String name;

    @Test
    public void test() throws NoSuchFieldException {
        //AnnotatedElementUtils是spring提供的一个查找注解的工具类
        System.out.println(AnnotatedElementUtils.getMergedAnnotation(UseAnnotation15.class, A15.class));
        System.out.println(AnnotatedElementUtils.getMergedAnnotation(UseAnnotation15.class.getDeclaredField("name"), A15.class));
    }
    /**
     * @com.coco.lesson001.demo18.A15(v1=我是v1, v2=我是v1)
     * @com.coco.lesson001.demo18.A15(v1=我是v2, v2=我是v2)
     */
}

@Target({
        ElementType.TYPE,
        ElementType.FIELD
})
@Retention(RetentionPolicy.RUNTIME)
@interface A15{

    @AliasFor("v2")
    String v1() default "";

    @AliasFor("v1")
    String v2() default "";
}
