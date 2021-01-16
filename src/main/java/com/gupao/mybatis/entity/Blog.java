package com.gupao.mybatis.entity;

import org.omg.CORBA.INTERNAL;

public class Blog {

    private Integer bid; // 文章ID
    private String name; // 文章标题
    private String authorId;

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }
}
