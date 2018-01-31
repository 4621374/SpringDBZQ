package com.zxj.mapper;

import java.util.List;

import com.dbzq.po.User;

public interface UserMapper {
   public User findUserById(int id);
   public List<User> findUserByName(String name);
   public void addUser(User user);
   public List<User> findUserAndItem() throws Exception;
}
