package com.jiangwei.test.testjava.dao.test1;

import com.jiangwei.test.testjava.user.dao.SyUserDao;
import com.jiangwei.test.testjava.user.domain.SyUser;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
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

    private static final String CONF_PATH = "mybatis-conf.xml";

    public static void main(String[] args) {
        SqlSessionFactoryTest test = new SqlSessionFactoryTest();
        test.getSyUser();
    }

    public void getSyUser() {
        SqlSession sqlSession = createSqlSession();
        SyUserDao syUserDao = sqlSession.getMapper(SyUserDao.class);
        SyUser syUser = syUserDao.selectSyUserOne(1);
        System.out.println(syUser.toString());
    }

    /**
     * 创建sqlSession
     * @return
     */
    public SqlSession createSqlSession() {
        InputStream inputStream = getInputStream(CONF_PATH);
        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory(inputStream);
        return sqlSessionFactory.openSession();
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
