package com.jiangwei.test.testjava.coll;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by weijiang
 * Date: 2016/11/3
 * Desc:
 */
public class IteratorTest {

    public static void main(String[] args) {

        List<String> strList = new ArrayList<String>();
        strList.add("FFFFFFFFF");
        strList.add("EEEEEEEEEE");
        strList.add("VVVVVVVVVV");
        Iterator<String> iter = strList.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
