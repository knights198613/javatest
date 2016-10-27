package com.jiangwei.test.testjava.management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by weijiang
 * Date: 2016/10/25
 * Desc: 关系系统类
 */

@Controller
@RequestMapping("/man")
public class ManagementController {
    @RequestMapping("/login")
    public String toLogin() {
        return "";
    }
}
