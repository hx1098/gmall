package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.user.mapper.UserMapper;
import com.atguigu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author hx   <br>
 * @Title: <br>
 * @Package <br>
 * @Description: <br>
 * @date 2020/6/717:45
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

}
