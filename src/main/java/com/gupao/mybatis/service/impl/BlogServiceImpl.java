package com.gupao.mybatis.service.impl;

import com.gupao.mybatis.entity.Blog;
import com.gupao.mybatis.mapper.BlogMapper;
import com.gupao.mybatis.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogServiceImpl implements IBlogService {

    @Autowired
    private BlogMapper blogMapper;

    @Override
    public Blog getBlogById(int bid) {
        return blogMapper.selectByPrimaryKey(bid);
    }

    @Override
    public int addBlog(Blog blog) {
        return blogMapper.insert(blog);
    }


}
