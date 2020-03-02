package com.gedu.controller;

import com.gedu.common.Result;
import com.gedu.common.StatusCode;
import com.gedu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/find",method = RequestMethod.GET)
    public Result findAllUser(){

        return new Result(true, StatusCode.OK,"",userService.findAllUser());
    }

    @RequestMapping(value = "/detail",method = RequestMethod.GET)
    public Result findUserDetail(String userId){

        return new Result(true, StatusCode.OK,"用户详情",userService.findDetail(userId));
    }

    @RequestMapping(value = "/code",method = RequestMethod.GET)
    public Result sendTelephoneCode(String mobile){
        userService.sendTelephoneCode(mobile);
        return new Result(true,StatusCode.OK,"发送成功");
    }
}
