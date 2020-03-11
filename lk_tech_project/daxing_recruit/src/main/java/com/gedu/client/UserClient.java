package com.gedu.client;

import com.gedu.client.impl.UserClientImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.gedu.entity.*;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "jerry",fallback = UserClientImpl.class)
public interface UserClient {
    @RequestMapping(value = "/user/find",method = RequestMethod.GET)
    public Result findAllUser();

    @RequestMapping(value = "/user/detail",method = RequestMethod.GET)
    public Result findUserDetail(@RequestParam("userId") String userId);
}
