package org.tt.admin.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;
import org.tt.admin.po.User;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by zangzhonghua on 2017/5/11.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"classpath:spring.xml"})
public class UserServiceTest {
    private UserService userService;
    @Resource
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Test
    public void findUserById() throws Exception {
        User user = this.userService.findUserById(1);
        //System.out.println(user.toString());
        Assert.isNull(user);
    }

}