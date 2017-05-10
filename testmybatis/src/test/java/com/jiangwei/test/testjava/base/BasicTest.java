package com.jiangwei.test.testjava.base;

import org.junit.Test;

/**
 * Created by weijiang
 * Date: 2017/5/10
 * Desc: 基本类型转换测试
 */


public class BasicTest {

    @Test
    public void testInt() {
        int h = 0;
        String s = "sfsdfsdwerwerwe";
        char StrArray[] = s.toCharArray();
        for(char x : StrArray) {
            System.out.println("char int:"+ (int)x);
            h = h*31 + x;
        }

        System.out.println(h);
    }
}
