package cn.xlbweb.fly.controller;

import cn.xlbweb.fly.server.ServerResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: Mr.X
 * @date: 2018/5/3 下午2:04
 * @description:
 */
@Controller
@RequestMapping("/admin")
public class IndexController {

    @GetMapping("/hello")
    @ResponseBody
    public ServerResponse hello() {
        return ServerResponse.success("hello word");
    }
}
