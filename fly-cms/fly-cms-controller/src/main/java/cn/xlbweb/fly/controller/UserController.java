package cn.xlbweb.fly.controller;

import cn.xlbweb.fly.IUserService;
import cn.xlbweb.fly.server.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: bobi
 * @date: 2018/7/22 12:32
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
