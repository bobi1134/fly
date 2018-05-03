package cn.xlbweb.fly.controller;

import cn.xlbweb.fly.server.ServerResponse;
import cn.xlbweb.fly.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: Mr.X
 * @date: 2018/5/3 下午1:02
 * @description:
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService iUserService;

    @GetMapping("/getAll")
    @ResponseBody
    public ServerResponse getAll() {
        return iUserService.findAll();
    }
}
