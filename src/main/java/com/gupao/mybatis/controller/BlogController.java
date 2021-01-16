package com.gupao.mybatis.controller;

import com.gupao.mybatis.entity.Blog;
import com.gupao.mybatis.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    private IBlogService blogService;

    @RequestMapping("list")
    public Blog getBlog(){
        Blog blog = new Blog();
        blog.setName("AAAAAAA");
        return blog;
    }

    @RequestMapping(value = "/dblist/{bid}",method = RequestMethod.GET)
    public Blog getBlogById(@PathVariable  Integer bid){
        return blogService.getBlogById(bid);
    }

}
