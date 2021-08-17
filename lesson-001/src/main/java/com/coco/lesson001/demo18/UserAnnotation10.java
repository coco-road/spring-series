package com.coco.lesson001.demo18;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.Map;

@Ann10("用在了类上")
public class UserAnnotation10<@Ann10("用在了类变量类型V1上") V1,@Ann10("用在了类变量类型V2上") V2> {
    private Map<@Ann10("用在了泛型类型上")String,Integer> map;
    public <@Ann10("用在了参数上") T>String m1(String name){
        return null;
    }

    List<@Ann10("String类型") String> list;
    List<@Ann10("String类型") ?> list2;
    Map<@Ann10("String类型") Integer, @Ann10("Double类型") Double> map2;

    public Map<@Ann10("String类型") Integer, @Ann10("Double类型") Double> m1(List<@Ann10("String类型") String> list) {
        this.list = list;
        return null;
    }
}


@Target({ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@interface Ann10{
    String value();
}
