package com.sjw.domain;

public class user {
    private  String name;
    private  int age;

    public user(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "user{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
