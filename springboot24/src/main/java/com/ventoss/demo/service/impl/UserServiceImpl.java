package com.ventoss.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ventoss.demo.bean.User;
import com.ventoss.demo.mapper.UserMapper;
import com.ventoss.demo.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Date:2022/8/12
 * Author:Vent
 * Description:
 **/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
