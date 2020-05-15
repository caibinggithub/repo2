package com.itheima.test;

import org.apache.ibatis.javassist.ClassPath;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @PackageName: com.itheima.test
 * @ClassName: ItemTest
 * @Author: caibing
 * @Date: 2020/5/11 15:44
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"ClassPath:applicationContext-dao.xml","classPath:applicationContext-service.xml"})
public class ItemTest {
    @Test
    public void test01(){
    }
}
