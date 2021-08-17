package com.coco.lesson001.demo18;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Ann4(name ={"我是路人甲java", "欢迎和我一起学spring"})
public class UseAnnotation4 {
    @Ann4(name = "如果只有一个值，{}可以省略")
    public class T1{}
}

/**
 * 数组类型参数
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Ann4{
    String[] name();
}