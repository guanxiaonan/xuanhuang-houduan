package com.gyn.user.service;

import com.gyn.user.pojo.User;

import java.util.List;

/**
 * @Description:
 * @Date: Create at 10:01, 2017/12/15
 * @Author: Matthew
 */
public interface UserService {

//    public void add(User user);
//
//    public void update(User user);
//
//    public void delete(Long id);
//
//    public User findById(Long id);
//
//    public List<User> findList();
//
//    public String findNameById(Long id);

    List<User> findAll();

    User login(User user);
}
