package org.tt.admin.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;
import org.tt.admin.dao.UserMapper;
import org.tt.admin.po.User;

import javax.annotation.Resource;

/**
 * Created by zangzhonghua on 2017/5/11.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"classpath:spring.xml"})
public class UserServiceMockTest {
    @Autowired
    @InjectMocks
    //表示 创建此bean时，这个bean有属性需要注入，使用mock的bean.,也就是下面的userMapper
    private UserService userService;

    @Mock //这是个虚拟的假的bean,当有需要我时，把这个假的给它
    private UserMapper userMapper;

    @Before
    public void init() {
        //必须 ：把有@Mock注解的bean给我mock好。以供使用
        MockitoAnnotations.initMocks(this);
    }

    @Test //真正开始调用了
    public void findUserById() throws Exception {
        //创建一个对象，做为从数据返回的对象
        User user = new User();
        user.setId(1);
        user.setUserName("王五");
        //当调用userMapper的xx()方法时，给它返回 xxx
        PowerMockito.when(this.userMapper.selectByPrimaryKey(1)).thenReturn(user);
        User rsUser = this.userService.findUserById(1);
        System.out.println(user);
        Assert.state(rsUser.getId() == user.getId());
    }
}
