package com.lank.demo.sys.service.impl;

import com.lank.demo.sys.entity.User;
import com.lank.demo.sys.mapper.UserMapper;
import com.lank.demo.sys.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统用户 服务实现类
 * </p>
 *
 * @author ljx
 * @since 2019-05-29
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
