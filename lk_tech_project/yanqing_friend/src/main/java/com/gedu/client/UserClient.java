package com.gedu.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.gedu.entity.*;

@FeignClient("jerry")
public interface UserClient {
    @RequestMapping(value = "/user/find",method = RequestMethod.GET)
    public Result findAllUser();

    @RequestMapping(value = "/user/detail",method = RequestMethod.GET)
    public Result findUserDetail(@RequestParam("userId") String userId);
}
