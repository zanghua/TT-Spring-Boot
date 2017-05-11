package org.tt.admin.zh;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.File;

import static org.junit.Assert.*;

/**
 * Created by zangzhonghua on 2017/5/11.
 */
public class ClassUnderTest {
    @Test
    public void callInternalInstance() throws Exception {
        File file = PowerMockito.mock(File.class);
        ClassUnder cu = new ClassUnder();
        PowerMockito.when(file.exists()).thenReturn(false);
        System.out.println(cu.callInternalInstance(file));
    }

}