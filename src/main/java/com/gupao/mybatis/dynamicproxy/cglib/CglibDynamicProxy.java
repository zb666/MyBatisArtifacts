package com.gupao.mybatis.dynamicproxy.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibDynamicProxy implements MethodInterceptor {
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("Before: "+method);
        methodProxy.invokeSuper(obj,args);
        System.out.println("After: "+method);
        return obj;
    }
}
