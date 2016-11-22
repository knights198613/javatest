package com.jiangwei.test.testjava.user.support;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * Created by Franco on 2016/11/22.
 */
public class UserNamespaceHandler extends NamespaceHandlerSupport {

    @Override
    public void init() {
        this.registerBeanDefinitionParser("user", new UserBeanDefinitionParser());
    }


}
