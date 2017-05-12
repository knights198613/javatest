package com.jiangwei.test.springtest.factorybean;

import com.jiangwei.test.springtest.factorybean.bean.Car;
import org.springframework.beans.factory.FactoryBean;

/**
 * Created by weijiang
 * Date: 2017/5/11
 * Desc: 测试factoryBean
 */
public class CarFactoryBean implements FactoryBean<Car> {

    private String carInfo;

    @Override
    public Car getObject() throws Exception {
        Car car = new Car();
        String[] carInfos = carInfo.split(",");
        car.setCarName(carInfos[0]);
        car.setMaxSpeed(Integer.valueOf(carInfos[1]));
        car.setMinSpeed(Integer.valueOf(carInfos[2]));
        car.setPrice(Double.valueOf(carInfos[3]));
        return car;
    }

    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }

    public String getCarInfo() {
        return carInfo;
    }

    public void setCarInfo(String carInfo) {
        this.carInfo = carInfo;
    }
}
