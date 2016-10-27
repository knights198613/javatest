package com.jiangwei.test.testjava.user;

import com.jiangwei.test.testjava.user.domain.SyUser;
import com.jiangwei.test.testjava.user.service.SyUserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * Created by weijiang
 * Date: 2016/10/27
 * Desc:
 */

public class TestUser {

    ClassPathXmlApplicationContext wac;
    SyUserService syUserService;
    @Before
    public void initSpring() {
        wac = new ClassPathXmlApplicationContext("classpath*:springcfg/spring-conf.xml");
        syUserService = (SyUserService)wac.getBean("syUserService");
    }

    @Test
    public void testFindUserById() {
        SyUser user = syUserService.findUserById(1);
        System.out.println(user);

    }

    @Test
    public void testInsertUser() {
        SyUser user = new SyUser();
        user.setUserName("魏江");
        user.setUserCode("weijiang");
        user.setAge(30);
        user.setSex("1");
        user.setEmail("jiangliuer198613@163.com");
        user.setTel("15699762309");
        user.setDegree(2);
        user.setDuty("普通工人");
        user.setBornCity("甘肃省兰州市榆中县");
        user.setPassWord("123456789");
        user.setModifyTime(new Date());
        user.setModifyUser("weijiang");
        Integer res = null;
        try {
            res = syUserService.inserUser(user);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println(res);
    }

}
