package org.tt.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tt.admin.dao.UserMapper;
import org.tt.admin.po.User;


/**
 * Created by zang on 2017/2/28.
 */
@Service
public class UserService{
    @Autowired
    private UserMapper userMapper;

    public User findUserById(int id) {
        return this.userMapper.selectByPrimaryKey(id);
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
}