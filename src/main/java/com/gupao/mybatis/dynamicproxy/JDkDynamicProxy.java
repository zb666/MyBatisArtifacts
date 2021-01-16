package com.gupao.mybatis.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDkDynamicProxy implements InvocationHandler {

    private TestDao testDao;

   public Object createObj(TestDao testDao){
       this.testDao = testDao;
       return Proxy.newProxyInstance(JDkDynamicProxy.class.getClassLoader(),testDao.getClass().getInterfaces(),this);
   }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //动态代理类的方法,TestDao 做动态代理
        MyAspect myAspect = new MyAspect();
        myAspect.before();
        //为Dao对象做动态代理 为TestDao做动态代理
        Object object = method.invoke(testDao, args);
        myAspect.after();
        return object;
    }
}
