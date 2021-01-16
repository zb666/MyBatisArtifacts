package com.gupao.mybatis.service;

import com.gupao.mybatis.entity.Blog;

public interface IBlogService {

    Blog getBlogById(int bid);

    int addBlog(Blog blog);


}
