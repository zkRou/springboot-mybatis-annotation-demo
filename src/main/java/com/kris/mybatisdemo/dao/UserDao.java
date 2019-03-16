package com.kris.mybatisdemo.dao;

import com.kris.mybatisdemo.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * User Dao
 *
 * @author Kairou Zeng on 2019-03-16.
 */
@Mapper
public interface UserDao {

    @Select("SELECT * FROM user WHERE user_name = #{username}")
    @Results({
            @Result(column = "user_name", property = "username")
    })
    User findUserByUsername(String username);

    @Insert("INSERT INTO user(user_name, age) VALUES (#{username}, #{age}) ")
    Integer insert(String username, Integer age);

    @Select("SELECT COUNT(*) FROM user")
    Long count();

    @Select("SELECT * FROM user")
    @Results({
            @Result(column = "user_name", property = "username")
    })
    List<User> findAll();

    @Update("UPDATE user SET user_name = #{username} where id = #{id}")
    void updateUser(String username, Long id);

}
