package com.jiangwei.test.testjava.user.dao.impl;

import com.jiangwei.test.testjava.commons.dao.BaseDao;
import com.jiangwei.test.testjava.user.dao.SyUserDao;
import com.jiangwei.test.testjava.user.domain.SyUser;
import org.springframework.stereotype.Repository;

/**
 * Created by weijiang
 * Date: 2016/10/27
 * Desc:
 */

@Repository("syUserDao")
public class SyUserDaoImpl extends BaseDao implements SyUserDao {

    @Override
    public SyUser findUserById(Integer id) {
        return this.getSqlSessionTemplate().selectOne("SyUser.selectSyUserOne", SyUser.class);
    }

    @Override
    public Integer insertUser(SyUser user) {
        return this.getSqlSessionTemplate().insert("SyUser.insertUser", user);
        //throw new RuntimeException("insert error");
        //return res;
    }
}
