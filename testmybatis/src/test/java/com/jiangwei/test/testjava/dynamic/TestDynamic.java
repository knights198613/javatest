package com.jiangwei.test.testjava.dynamic;

import com.jiangwei.test.testjava.dynamic.impl.UserManageService;
import org.junit.Test;

/**
 * Created by weijiang
 * Date: 2016/10/28
 * Desc:
 */
public class TestDynamic {

    @Test
    public void testUserManageService() {
        UserManageService userManageService = new UserManageService();
        boolean a = userManageService.doService(50l, 50l);
        System.out.println(a);
    }

}
