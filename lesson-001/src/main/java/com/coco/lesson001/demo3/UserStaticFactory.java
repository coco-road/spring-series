package com.coco.lesson001.demo3;

public class UserStaticFactory {

    /**
     * 静态无参方法创建UserModel
     */
    public static UserModel buildUser1(){
        System.out.println(UserStaticFactory.class+".buildUser1()");
        UserModel userModel = new UserModel();
        userModel.setName("静态无参方法创建");
        return userModel;
    }

    /**
     * 静态有参方法创建UserModel
     * @param name
     * @param age
     * @return
     */
    public static UserModel buildUser2(String name,int age){
        System.out.println(UserStaticFactory.class+".buildUser2()");
        UserModel userModel = new UserModel();
        userModel.setName(name);
        userModel.setAge(age);
        return userModel;
    }
}
