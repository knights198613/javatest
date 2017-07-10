package com.jiangwei.test.testjava.user.service.impl;

import com.jiangwei.test.testjava.user.dao.SyUserDao;
import com.jiangwei.test.testjava.user.domain.SyUser;
import com.jiangwei.test.testjava.user.service.SyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by weijiang
 * Date: 2016/10/27
 * Desc:
 */
@Service("syUserService")
public class SyUserServiceImpl implements SyUserService {
    @Autowired
    private SyUserDao syUserDao;

    @Override
    @Transactional
    public SyUser findUserById(Integer id) {
        return syUserDao.selectSyUserOne(id);
    }

    @Override
    @Transactional
    public Integer inserUser(SyUser user) {
        return syUserDao.insertUser(user);
    }
}
