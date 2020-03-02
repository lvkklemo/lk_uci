package com.gedu.listener;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

//消息消费者
@Component
@RabbitListener(queues = "sms")
public class SmsListener {

    @RabbitHandler
    public void executeSms(Map<String,String> map){
       String mobile = map.get("mobile");
       String checkCode = map.get("checkCode");
        System.out.println("收到消息");
       System.out.println("手机号: " + mobile);
        System.out.println("验证码: " + checkCode);

    }

}
