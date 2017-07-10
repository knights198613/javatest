package com.jiangwei.test.testjava.dao.test1;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by weijiang
 * Date: 2017/7/10
 * Desc: mybatis SqlSessionFactory测试
 */
public class SqlSessionFactoryTest {

    public static void main(String[] args) {
        String path = "mybatis-conf.xml";
        SqlSessionFactoryTest test = new SqlSessionFactoryTest();
        InputStream inputStream = test.getInputStream(path);
        SqlSessionFactory sqlSessionFactory = test.getSqlSessionFactory(inputStream);
        System.out.println(sqlSessionFactory);

    }



    /**
     * 通过文件路径获取文件流信息
     * @param path
     * @return
     */
    InputStream getInputStream(String path) {
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputStream;
    }

    /**
     * 创建sqlSessionFactory
     * @param inputStream
     * @return
     */
    SqlSessionFactory getSqlSessionFactory(InputStream inputStream) {
        SqlSessionFactory sqlSessionFactory = null;
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        return sqlSessionFactory;
    }
}
