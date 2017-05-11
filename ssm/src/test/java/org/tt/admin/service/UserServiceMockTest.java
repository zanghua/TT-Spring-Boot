package org.tt.admin.service;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.tt.admin.dao.UserMapper;

/**
 * Created by zangzhonghua on 2017/5/11.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(UserMapper.class)
public class UserServiceMockTest {
    @Mock
    public UserMapper userMapper;

    @Before
    public void after() {

    }
}
