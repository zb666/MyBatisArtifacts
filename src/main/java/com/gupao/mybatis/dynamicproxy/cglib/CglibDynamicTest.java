package com.gupao.mybatis.dynamicproxy.cglib;

import org.springframework.cglib.proxy.Enhancer;

public class CglibDynamicTest {

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Student.class);
        enhancer.setCallback(new CglibDynamicProxy());
        Student student = (Student) enhancer.create();
        student.sayHello();
        student.speak();
        student.walk();
    }
}
