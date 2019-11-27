package com.gp;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author gao peng
 * @date 2019/11/27 16:16
 */
public class UserService {

  public void insertUser(User user) {
    SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
    try {
      UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
      userMapper.insertUser(user);
      sqlSession.commit();
    } finally {
      sqlSession.close();
    }
  }

  public User getUserById(Integer userId) {
    SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
    try {
      UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
      return userMapper.getUserById(userId);
    } finally {
      sqlSession.close();
    }
  }

  public List<User> getAllUsers() {
    SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
    try {
      UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
      return userMapper.getAllUsers();
    } finally {
      sqlSession.close();
    }
  }

  public void updateUser(User user) {
    SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
    try {
      UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
      userMapper.updateUser(user);
      sqlSession.commit();
    } finally {
      sqlSession.close();
    }

  }

  public void deleteUser(Integer userId) {
    SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
    try {
      UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
      userMapper.deleteUser(userId);
      sqlSession.commit();
    } finally {
      sqlSession.close();
    }

  }
}
