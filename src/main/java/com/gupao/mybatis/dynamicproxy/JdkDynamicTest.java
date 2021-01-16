package com.gupao.mybatis.dynamicproxy;

public class JdkDynamicTest {
    public static void main(String[] args) {
        JDkDynamicProxy jDkDynamicProxy = new JDkDynamicProxy();
        //创建动态代理对象，或者为原先的类做增强操作
        TestDao testDao = new TestDaoImpl();
        TestDao proxyTestDao = (TestDao) jDkDynamicProxy.createObj(testDao);
        proxyTestDao.modify();
    }
}
