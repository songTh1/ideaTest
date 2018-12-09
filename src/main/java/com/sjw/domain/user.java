package com.sjw.domain;

public class user {
    private  String name;
    private  int age;
    private  String address;


    @Override
    public String toString() {
        return "user{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
