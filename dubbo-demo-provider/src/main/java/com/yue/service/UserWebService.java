package com.yue.service;

import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import service.UserService;

/**
 * @description:
 * @author: yudongyue
 * @date: Created in 2021/6/4 16:59
 */
// 暴漏服务
@Service(version = "1.0.0")
@Component
public class UserWebService implements UserService {


    public String getUser() {
        return "hello";
    }

}
