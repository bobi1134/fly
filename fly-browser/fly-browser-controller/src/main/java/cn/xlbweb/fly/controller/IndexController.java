package cn.xlbweb.fly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: Mr.X
 * @date: 2018/5/2 下午11:01
 * @description:
 */
@Controller
@RequestMapping
public class IndexController {

    @GetMapping
    public String index() {
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/reg")
    public String reg() {
        return "reg";
    }
}
