package com.gp;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * @author gao peng
 * @date 2019/11/27 16:16
 */
public class MyBatisUtil {
  private static SqlSessionFactory factory;

  private MyBatisUtil() {
  }

  static {
    Reader reader = null;
    try {
      reader = Resources.getResourceAsReader("mybatis-config.xml");
    } catch (IOException e) {
      throw new RuntimeException(e.getMessage());
    }
    factory = new SqlSessionFactoryBuilder().build(reader);
  }

  public static SqlSessionFactory getSqlSessionFactory() {
    return factory;
  }

}
