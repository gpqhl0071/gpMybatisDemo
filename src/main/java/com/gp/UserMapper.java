package com.gp;

import java.util.List;

/**
 * @author gao peng
 * @date 2019/11/27 16:13
 */
public interface UserMapper {

  public void insertUser(User user);

  public User getUserById(Integer userId);

  public List<User> getAllUsers();

  public void updateUser(User user);

  public void deleteUser(Integer userId);

}
