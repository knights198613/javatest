package com.jiangwei.test.testjava.user.service;

import com.jiangwei.test.testjava.user.domain.SyUser;

/**
 * Created by weijiang
 * Date: 2016/10/27
 * Desc:
 */
public interface SyUserService {
    /**
     * 通过Id查询User
     * @param id
     * @return
     */
    public SyUser findUserById(Integer id);

    /**
     * 插入user信息
     * @return
     */
    public Integer inserUser(SyUser user);
}
