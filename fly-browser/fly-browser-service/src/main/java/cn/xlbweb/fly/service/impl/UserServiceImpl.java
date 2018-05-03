package cn.xlbweb.fly.service.impl;

import cn.xlbweb.fly.entity.pojo.User;
import cn.xlbweb.fly.mapper.UserMapper;
import cn.xlbweb.fly.server.ServerResponse;
import cn.xlbweb.fly.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: Mr.X
 * @date: 2018/5/3 下午1:12
 * @description:
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public ServerResponse findAll() {
        List<User> userList = userMapper.findAll();
        return ServerResponse.success(userList);
    }
}
