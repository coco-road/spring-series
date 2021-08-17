package com.coco.lesson001.Type;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

import lombok.*;

import java.io.Serializable;

public class Demo7 {

    /**
     * 通用的返回值类型
     *
     * @param <T>
     */
    @Getter
    @Setter
    @ToString
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Result<T> implements Serializable{
        private String code;
        private String subCode;
        private String msg;
        private T data;
    }

    @Setter
    @Getter
    @Builder
    @ToString
    @NoArgsConstructor
    @AllArgsConstructor
    public static class UserModel{
        private Integer id;
        private String name;
    }

    /**
     * 返回一个用户信息
     *
     * @return
     */
    public static Result<UserModel> getUser(){
        UserModel userModel = UserModel.builder().id(1).name("路人甲Java").build();
        Result<UserModel> result = Result.<UserModel>builder()
                .code("1")
                .subCode(null)
                .msg("操作成功")
                .data(userModel)
                .build();
        return result;
    }

    /**
     * 用户json信息
     *
     * @return
     */
    public static String getUserString(){
        return JSON.toJSONString(getUser());
    }

    public static void main(String[] args) {
        String userString = getUserString();
        //{"code":"1","data":{"id":1,"name":"路人甲Java"},"msg":"操作成功"}
        System.out.println(userString);

        //下面我们需要将userString反序列化为Result<UserModel>对象
        Result<UserModel> userModelResult = JSON.parseObject(userString, new TypeReference<Result<UserModel>>(){

        });

        //我们来看看Result中的data是不是UserModel类型的
        System.out.println(userModelResult.getData().getClass());
    }

}
