package com.jiangwei.test.testjava.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by weijiang
 * Date: 2016/11/16
 * Desc:
 */
@XmlType(propOrder = {"price", "name", "count"})
public class Book {

    private String name;
    private int count;
    private double price;

    @XmlElement
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @XmlElement
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
