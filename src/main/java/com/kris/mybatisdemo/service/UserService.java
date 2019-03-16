package com.kris.mybatisdemo.service;

import com.kris.mybatisdemo.dao.UserDao;
import com.kris.mybatisdemo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
  * User Service
  *
  *
 * @author Kairou Zeng on 2019-03-16.
 */
 @Service
public class UserService {

     @Autowired
     private UserDao userDao;

    /**
     * 根据用户名查询{@link User}
     *
     * @param name  用户名
     * @return      {@link User}
     */
     public User findByName(String name){
         return userDao.findUserByUsername(name);
     }

     public Integer insert(String name, Integer age){
         return userDao.insert(name, age);
     }

    public Long count(){
         return userDao.count();
    }

    public List<User> findAll(){
         return userDao.findAll();
    }

    public void updateUser(String name, Long id){
         userDao.updateUser(name, id);
    }
}
