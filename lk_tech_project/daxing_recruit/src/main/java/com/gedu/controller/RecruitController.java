package com.gedu.controller;
import com.gedu.client.UserClient;
import com.gedu.domain.Recruit;
import com.gedu.service.RecruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gedu.entity.*;


@RestController

@RequestMapping(value = "/recruit")
public class RecruitController {

    @Autowired
    private RecruitService recruitService;

    @Autowired
    private UserClient userClient;

    @RequestMapping(value = "/findByState",method = RequestMethod.GET)
    public Result findTop1ByStateOrderByCreatetimeDesc(String state){
        Recruit recruitList = recruitService.findTop1ByStateOrderByCreatetimeDesc(state);
        return new Result(true, StatusCode.OK,"查询成功",recruitList);
    }

    @RequestMapping(value = "/findUser",method = RequestMethod.GET)
    public Result findUser(){
        return userClient.findAllUser();
    }

    @RequestMapping(value = "/userDetail",method = RequestMethod.GET)
    public Result findUserDetail(@RequestParam("userId")String userId){
        System.out.println("用户id"+userId);
        return userClient.findUserDetail(userId);
    }

}
