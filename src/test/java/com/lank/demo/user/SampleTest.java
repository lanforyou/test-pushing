package com.lank.demo.user;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lank.demo.sys.entity.User;
import com.lank.demo.sys.mapper.UserMapper;
import com.lank.demo.sys.service.IUserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.constraints.AssertTrue;
import java.util.List;
import java.util.Map;

/**
 * @Author: ljx
 * @Date: 2019/5/29 15:27
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleTest {

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private IUserService service;

    @Test
    public void logicDelete(){
        service.removeById(2L);
    }
    @Test
    @Transactional
    public void saveTest(){
        User user = new User();
        user.setUsername("newLan1");
        user.setLoginPassword("lan123");
        user.setEmail("123@123.com");
        boolean saved = service.save(user);
        Assert.assertTrue(saved);
    }
    @Test
    public void pageTest(){
        Page<User> page = new Page<>();
        page.setSize(2);
        IPage<User> iPage = userMapper.selectPageVo(page,"lan");
        Assert.assertEquals(1,iPage.getCurrent());
        iPage.getRecords().forEach(System.out::println);
        Assert.assertTrue(page.hasNext());
        iPage.setPages(2).getRecords().forEach(System.out::println);
    }

    @Test
    public void getAllByXml(){
        List<Map<String,Object>> userList = userMapper.getAllByXml(1L);
        userList.forEach(System.out::println);
    }

    @Test
    public void getAllByXml_noParameter(){
        List<Map<String,Object>> userList = userMapper.getAllByXml(null);
        userList.forEach(System.out::println);
    }

    @Test
    public void customSql(){
        List<Map<String,Object>> userList = userMapper.getAllUser();
        userList.forEach(System.out::println);
    }

    @Test
    public void conditionQuery(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username","lan").isNotNull("email");

        User user = userMapper.selectOne(queryWrapper);
        System.out.println(user);
    }


    @Test
    public void serviceTest(){
        User user = service.getById(1L);
        System.out.println(user);
    }

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));

        List<User> userList = userMapper.selectList(null);
        Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
    }

}
