package com.cc.springmvc.mapper;

import com.cc.springmvc.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    @Select("select * from user")
    List<User> findAll();

    @Insert("insert into user (name,username,password,type) values (#{name},#{username},#{password},#{type})")
    void saveUser(User user);

    @Delete("delete from user where id = #{id}")
    void deleteUser(int id);

    @Update("update user set name=#{name},username=#{username},password=#{password},type=#{type} where id =#{id}")
    void updateUser(User user);
}
