package com.coco.lesson001.demo18;

import org.junit.Test;

import java.lang.annotation.*;

/**
 * 作用：让子类可以继承父类中被@Inherited修饰的注解，注意是继承父类中的，
 * 如果接口中的注解也使用@Inherited修饰了，那么接口的实现类是无法继承这个注解的
 */
public class InheritAnnotationTest {

    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    @Inherited
    @interface A1{}

    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    @Inherited
    @interface A2{}

    @A1
    interface I1{}
    @A2
    static class C1{}

    static class C2 extends C1 implements I1{}

    public static void main(String[] args) {
        for (Annotation annotation: C2.class.getAnnotations()) {
            System.out.println(annotation);
        }
    }

    /**
     * @com.coco.lesson001.demo18.InheritAnnotationTest$A2()
     * 从输出中可以看出类可以继承父类上被@Inherited修饰的注解，
     * 而不能继承接口上被@Inherited修饰的注解，这个一定要注意
     */
    @Test
    public void m1(){
        for (Annotation annotation: C2.class.getAnnotations()) {
            System.out.println(annotation);
        }
    }

}
