package com.ethen.mybatis.demo.mapper;

import com.ethen.mybatis.demo.model.Blog;

public interface BlogMapper {
    Blog selectBlog(int id);
}
