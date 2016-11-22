package com.jiangwei.test.testjava.user.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Franco on 2016/11/22.
 */
public class CustomerDefinationBeanTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:springcfg/spring.xml");
        User user = (User) context.getBean("user");
        System.out.println(user.getEmail()+"%%%%"+user.getUserName());

    }
}
