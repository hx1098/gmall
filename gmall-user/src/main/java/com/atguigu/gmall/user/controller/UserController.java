package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author hx   <br>
 * @Title: <br>
 * @Package <br>
 * @Description: <br>
 * @date 2020/6/717:44
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    @ResponseBody
    public String index() {
        return "hello User";
    }
}
