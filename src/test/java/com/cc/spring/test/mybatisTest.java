package com.cc.spring.test;

import com.cc.springmvc.domain.User;
import com.cc.springmvc.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class mybatisTest {

    @Test
    public void testMybatis() throws IOException {
        //加载配置文件
        InputStream inputStream = Resources.getResourceAsStream("sqlmap-config.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //创建SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //调用方法查询数据
        List<User> list = userMapper.findAll();
        for (User user : list) {
            System.out.println(user);
        }
    }

    @Test
    public void testUpdateUser() throws IOException {
        //加载配置文件
        InputStream inputStream = Resources.getResourceAsStream("sqlmap-config.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //创建SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setName("3");
        user.setUsername("3");
        user.setPassword("3");
        user.setType("3");
        user.setId(6);
        userMapper.updateUser(user);

    }
}
