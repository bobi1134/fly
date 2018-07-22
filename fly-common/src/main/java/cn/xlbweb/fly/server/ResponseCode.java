package cn.xlbweb.fly.server;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author: Mr.X
 * @date: 2018/5/3 下午1:06
 * @description:
 */
@Getter
@AllArgsConstructor
public enum ResponseCode {

    SUCCESS(0, "成功"),
    ERROR(1, "失败");

    /**
     * 响应状态码
     */
    private final int code;
    /**
     * 响应消息
     */
    private final String msg;
}
