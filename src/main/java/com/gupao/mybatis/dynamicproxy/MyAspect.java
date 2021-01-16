package com.gupao.mybatis.dynamicproxy;

public class MyAspect {
    void check(){
        System.out.println("检查信息XXX");
    }
    void before(){
        System.out.println("切面前置条件");
    }
    void after(){
        System.out.println("切面后置条件");
    }
}
