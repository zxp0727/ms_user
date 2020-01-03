package com.learn.ms_user.service.impl;

import com.learn.ms_user.domain.entity.User;
import com.learn.ms_user.repository.UserRepository;
import com.learn.ms_user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserServiceImpl
 * @Description 用户服务实现类
 * @Author ZhouXiaoPing
 * @Date 2020/1/3 15:33
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getById(Integer id) {
        return this.userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("用户数据不存在！"));
    }
}
