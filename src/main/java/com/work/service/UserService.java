package com.work.service;


import com.work.base.BaseService;
import com.work.dao.UserMapper;
import com.work.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xlf on 2019/7/12.
 */
@Service
public class UserService extends BaseService<User> {
    @Autowired
    private UserMapper userMapper;
}
