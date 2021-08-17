package com.coco.lesson001.Type;


import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

interface Demo1T1{}
interface Demo1T2{}

/**
 * 类中泛型变量案例
 */
public class Demo1<T1,T2 extends Integer,T3 extends Demo1T1 & Demo1T2> {

    public static void main(String[] args) {
        TypeVariable<Class<Demo1>>[] typeParameters = Demo1.class.getTypeParameters();
        for (TypeVariable<Class<Demo1>> typeParameter: typeParameters ) {
            System.out.println("变量名称:"+typeParameter.getName());
            System.out.println("这个变量在哪声明的:" +typeParameter.getGenericDeclaration());
            Type[] bounds = typeParameter.getBounds();
            System.out.println("这个变量上边界数量:" + bounds.length);
            System.out.println("这个变量上边界清单:");
            for (Type boud : bounds){
                System.out.println(boud.getTypeName());
            }
        }
    }
}
