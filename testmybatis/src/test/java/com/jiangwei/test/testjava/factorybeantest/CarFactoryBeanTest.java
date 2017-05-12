package com.jiangwei.test.testjava.factorybeantest;

import com.alibaba.fastjson.JSON;
import com.jiangwei.test.springtest.factorybean.CarFactoryBean;
import com.jiangwei.test.springtest.factorybean.bean.Car;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by weijiang
 * Date: 2017/5/11
 * Desc:
 */
public class CarFactoryBeanTest {
    ApplicationContext context;

    //spring的工厂bean在容器中管理前缀
    private final static String FACTORY_BEAN_PREFIX = "&";

    @Before
    public void before() {
        context = new ClassPathXmlApplicationContext("classpath:/springcfg/spring.xml");
    }

    @Test
    public void testGetBean() {
        Car carBean = (Car) context.getBean("car");
        try {
            System.out.println(JSON.toJSONString(carBean));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testGetFactoryBean() {
        CarFactoryBean carFactoryBean = (CarFactoryBean) context.getBean("car");
        try {
            Car car = carFactoryBean.getObject();
            System.out.println(JSON.toJSONString(car));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
