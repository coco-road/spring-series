package com.coco.lesson001.Type;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

//泛型类
class Demo<T1,T2>{}

public class Demo6 extends Demo<String,Integer> {

    public static void main(String[] args) {
        Demo6 demo6 = new Demo6();
        //demo6Class对应的是Demo6的Class对象
        Class<? extends Demo6> demo6Class = demo6.getClass();

        //获取Demo6的父类的详细类型信息，包含泛型信息
        Type genericSuperclass = demo6Class.getGenericSuperclass();
        // 泛型类型用ParameterizedType接口表示，输出看一下是不是这个接口类型的
        System.out.println(genericSuperclass.getClass());
        if(genericSuperclass instanceof ParameterizedType){
            ParameterizedType pt = (ParameterizedType) genericSuperclass;
            System.out.println(pt.getRawType());
            Type[] actualTypeArguments = pt.getActualTypeArguments();
            for (Type actualTypeArgument: actualTypeArguments) {
                System.out.println(actualTypeArgument.getTypeName());
            }
            System.out.println(pt.getOwnerType());
        }
    }
}
