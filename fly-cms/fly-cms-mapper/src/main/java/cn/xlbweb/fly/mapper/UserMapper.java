package cn.xlbweb.fly.mapper;

import cn.xlbweb.fly.entity.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: Mr.X
 * @date: 2018/5/3 下午1:14
 * @description:
 */
@Mapper
public interface UserMapper {

    /**
     * 查询所有用户
     *
     * @return
     */
    List<User> findAll();
}
