package cn.xlbweb.fly.entity.pojo;

import lombok.*;

import java.io.Serializable;

/**
 * @author: Mr.X
 * @date: 2018/5/3 下午12:59
 * @description:
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

    /**
     * 主键id
     */
    private Integer id;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
}
