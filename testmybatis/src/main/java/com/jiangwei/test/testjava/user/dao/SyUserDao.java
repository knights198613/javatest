package com.jiangwei.test.testjava.user.dao;

import com.jiangwei.test.testjava.user.domain.SyUser;

/**
 * Created by weijiang
 * Date: 2016/10/27
 * Desc:
 */
public interface SyUserDao {
    /**
     * 通过Id查询用户
     * @param id
     * @return
     */
    public SyUser findUserById(Integer id);

    /**
     * 插入用户信息
     * @param user
     * @return
     */
    public Integer insertUser(SyUser user);
}
