package com.gedu.controller;

import com.gedu.client.UserClient;

import com.gedu.entity.Result;
import com.gedu.entity.StatusCode;
import com.gedu.service.FriendService;
import com.gedu.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController

@RequestMapping(value = "/friend")
public class FriendController {

    @Autowired
    private FriendService friendService;

    @Autowired
    private UserClient userClient;

    @Autowired
    private MailService mailService;

    @RequestMapping(value = "/send",method = RequestMethod.GET)
    public Result sendSimpleMail(String to,String subject,String content){
        System.out.println(content);
        mailService.sendSimpleMail(to,subject,content);
        return new Result(true, StatusCode.OK,"发送成功");
    }


}
