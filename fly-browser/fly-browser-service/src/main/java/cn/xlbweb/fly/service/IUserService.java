package cn.xlbweb.fly.service;

import cn.xlbweb.fly.server.ServerResponse;

/**
 * @author: Mr.X
 * @date: 2018/5/3 下午1:12
 * @description:
 */
public interface IUserService {

    /**
     * 查询所有用户
     *
     * @return
     */
    ServerResponse findAll();
}
