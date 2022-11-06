package com.ethen.mybatis.demo;

import com.ethen.mybatis.demo.model.Blog;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * mybatis hello world
 *
 * @author ethenyang@126.com
 * @since 2022/11/04
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Blog blog = sqlSession.selectOne("com.ethen.mybatis.demo.mapper.BlogMapper.selectBlog", 101);
        System.err.println(blog);
    }
}
