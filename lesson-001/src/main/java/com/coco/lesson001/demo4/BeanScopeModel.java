package com.coco.lesson001.demo4;

public class BeanScopeModel {

    public BeanScopeModel(String beanScope) {
        System.out.println(String.format("线程:%s,create BeanScopeModel,{scope=%s},{this=%s}",Thread.currentThread(),beanScope,this));
    }
}
