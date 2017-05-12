package com.jiangwei.test.springtest.factorybean.bean;

/**
 * Created by weijiang
 * Date: 2017/5/11
 * Desc:
 */
public class Car {
    private String carName;
    private Integer maxSpeed;
    private Integer minSpeed;
    private Double price;

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Integer getMinSpeed() {
        return minSpeed;
    }

    public void setMinSpeed(Integer minSpeed) {
        this.minSpeed = minSpeed;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
