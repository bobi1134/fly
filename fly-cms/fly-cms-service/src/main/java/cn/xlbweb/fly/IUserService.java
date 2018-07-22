package cn.xlbweb.fly;

import cn.xlbweb.fly.server.ServerResponse;

/**
 * @author: bobi
 * @date: 2018/7/22 12:34
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
