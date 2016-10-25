package com.jiangwei.test.testjava;

import org.apache.log4j.MDC;

/**
 * Created by weijiang
 * Date: 2016/10/25
 * Desc: MDC 测试类
 */
public class TestMDC extends Thread{

    private int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public TestMDC(int y) {
        this.i = y;
    }

    public TestMDC() {

    }


    @Override
    public void run() {
        System.out.println("i ++ 操作后的值为："+ ++i);
        MDC.put("username", i);
        for(int j=0; j<100; j++) {
            System.out.println("aaaa"+i);
            if(j==10) {
                try {
                    this.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("after run, MDC value is :" + MDC.get("username"));

    }

    public static void main(String args[]) {
        TestMDC thread1 = new TestMDC(1);
        thread1.start();
        TestMDC thread2 = new TestMDC(2);
        thread2.start();
    }
}
