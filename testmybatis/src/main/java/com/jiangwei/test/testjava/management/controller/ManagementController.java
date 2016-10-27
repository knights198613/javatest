package com.jiangwei.test.testjava.management.controller;

import com.jiangwei.test.testjava.user.domain.SyUser;
import com.jiangwei.test.testjava.user.service.SyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by weijiang
 * Date: 2016/10/25
 * Desc: 关系系统类
 */

@Controller
@RequestMapping("/man")
public class ManagementController {
    @Autowired
    SyUserService syUserService;

    @RequestMapping("/login")
    public String toLogin(ModelAndView mv) {
        SyUser user = syUserService.findUserById(1);
        return "management/managementList";
    }
}
