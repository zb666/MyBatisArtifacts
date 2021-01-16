package com.gupao.mybatis.entity;


public class Blog {

    private Integer bid; // 文章ID
    private String name; // 文章标题
    private String authorId;

    public Integer getBid() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                bid++;
            }
        }).start();
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
