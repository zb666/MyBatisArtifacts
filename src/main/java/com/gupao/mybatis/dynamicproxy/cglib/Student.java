package com.gupao.mybatis.dynamicproxy.cglib;

public class Student extends Father implements IPerson {
    @Override
    public void speak() {
        System.out.println("I am Student");
    }

    @Override
    public void walk() {

    }
}
