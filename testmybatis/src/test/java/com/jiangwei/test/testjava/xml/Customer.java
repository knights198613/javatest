package com.jiangwei.test.testjava.xml;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * Created by weijiang
 * Date: 2016/11/16
 * Desc:
 */
@XmlRootElement
@XmlType(propOrder = {"name", "age","bookList"})
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Customer {
    private int id;
    private String name;
    private int age;

    private List<Book> bookList;

    @XmlAttribute(name="id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
}
