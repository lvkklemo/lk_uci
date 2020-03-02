package com.gedu.service;

import com.gedu.dao.UserDao;
import com.gedu.domain.User;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.jws.soap.SOAPBinding;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
public class UserService {

    @Resource
    private UserDao userDao;
    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private RabbitTemplate rabbitTemplate;

    public List<User> findAllUser(){

        return userDao.findAllUser();
    }

    //findDetail
    public User findDetail(String userId){

        return userDao.findDetail(userId);
    }

    public void sendTelephoneCode(String mobile) {
        //生成6位随机数
        String checkCode = RandomStringUtils.randomNumeric(4);
        System.out.println("checkCode = " + checkCode);

        //向缓存存储
        redisTemplate.opsForValue().set("checkCode_"+mobile,checkCode,6, TimeUnit.HOURS);

        //给用户发验证码
        //消息生产者
        HashMap<String, String> map = new HashMap<>();
        map.put("mobile",mobile);
        map.put("checkCode",checkCode);
        rabbitTemplate.convertAndSend("sms",map);
    }
}
