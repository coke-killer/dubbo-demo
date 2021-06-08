package com.yue.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.UserService;

/**
 * @description:
 * @author: yudongyue
 * @date: Created in 2021/6/4 17:21
 */
@Controller
public class UserController {
    @Reference(version = "1.0.0")
    UserService userWebService;

    @GetMapping("/get")
    @ResponseBody
    public String getName() {
        return userWebService.getUser();
    }
}
