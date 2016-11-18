package com.jiangwei.test.testjava.xml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by weijiang
 * Date: 2016/11/16
 * Desc:
 */
public class Object2XmlDemo1 {

    public static void main(String[] args) {
        object2Xml();
        xml2Object();
    }


    public static void object2Xml() {
        Customer customer = new Customer();
        customer.setId(100);
        customer.setAge(25);
        customer.setName("John Tomas");

        Book b1 = new Book();
        b1.setName("white house");
        b1.setCount(1);
        b1.setPrice(12.96);
        Book b2 = new Book();
        b2.setName("red apple");
        b2.setCount(2);
        b2.setPrice(23.45);

        List<Book> bookList = new ArrayList<Book>();
        bookList.add(b1);
        bookList.add(b2);

        customer.setBookList(bookList);

        try {
            File file = new File("D:\\xml\\customer.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(customer.getClass());
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
            marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
            marshaller.marshal(customer, file);
            marshaller.marshal(customer, System.out);
            System.out.println();
            StringWriter stringWriter = new StringWriter();
            marshaller.marshal(customer, stringWriter);

            String result = stringWriter.toString();

            System.out.println("结果为："+result);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public static void xml2Object() {
        Customer customer = new Customer();
        File xmlFile =  new File("D:\\xml\\customer.xml");
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(customer.getClass());
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            customer = (Customer) unmarshaller.unmarshal(xmlFile);
            System.out.println(customer);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
