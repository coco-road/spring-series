package com.coco.lesson001.demo12;

public class ServiceB {
    private String name;
    //
    private String copy;
    private ServiceA serviceA;


    public String getCopy() {
        return copy;
    }

    public void setCopy(String copy) {
        this.copy = copy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ServiceA getServiceA() {
        return serviceA;
    }

    public void setServiceA(ServiceA serviceA) {
        this.serviceA = serviceA;
    }

    @Override
    public String toString() {
        return "ServiceB{" +
                "name='" + name + '\'' +
                ", copy='" + copy + '\'' +
                ", serviceA=" + serviceA +
                '}';
    }
}
