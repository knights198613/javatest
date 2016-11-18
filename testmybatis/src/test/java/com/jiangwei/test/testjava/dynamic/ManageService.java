package com.jiangwei.test.testjava.dynamic;

/**
 * Created by weijiang
 * Date: 2016/10/28
 * Desc:
 */
public abstract class ManageService {

    public boolean getServiceProxy(Long a, Long b) {
        return true;
    }

    public boolean doService(Long a, Long b) {
        System.out.println("调用参数值为："+a+","+b);
        return this.getServiceProxy(a,b);
    }
}
