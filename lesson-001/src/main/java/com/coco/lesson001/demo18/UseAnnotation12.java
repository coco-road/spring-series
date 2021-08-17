package com.coco.lesson001.demo18;

import org.junit.Test;

import java.lang.annotation.*;
import java.lang.reflect.Field;

@Ann12(name = "路人甲Java")
@Ann12(name = "Spring系列")
public class UseAnnotation12 {
    @Ann12s({
            @Ann12(name = "Java高并发系列，见公众号"),
            @Ann12(name = "mysql高手系列，见公众号")
    })
    private String v1;

    @Test
    public void test() throws NoSuchFieldException {
        Annotation[] annotations = UseAnnotation12.class.getAnnotations();
        for (Annotation annotation:annotations             ) {
            System.out.println(annotation);
        }
        System.out.println("-------------");
        Field field = UseAnnotation12.class.getDeclaredField("v1");
        Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
        for (Annotation annotation:declaredAnnotations) {
            System.out.println(annotation);
        }

    }
}

@Target({ElementType.TYPE,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@interface Ann12s{
    Ann12[] value();
}

@Target({ElementType.TYPE,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Ann12s.class)
@interface Ann12{
    String name();
}

