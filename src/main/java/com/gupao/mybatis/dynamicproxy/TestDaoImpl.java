package com.gupao.mybatis.dynamicproxy;

public class TestDaoImpl implements TestDao {
    @Override
    public void save() {
        System.out.println("保存了数据");
    }

    @Override
    public void modify() {
        System.out.println("修改了数据");
    }
}
