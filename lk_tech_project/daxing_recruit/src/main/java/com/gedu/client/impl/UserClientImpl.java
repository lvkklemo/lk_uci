package com.gedu.client.impl;

import com.gedu.client.UserClient;
import com.gedu.entity.Result;
import com.gedu.entity.StatusCode;
import org.springframework.stereotype.Component;

@Component
public class UserClientImpl implements UserClient {
    @Override
    public Result findAllUser() {
        return new Result(false, StatusCode.ERROR,"熔断器启动了");
    }

    @Override
    public Result findUserDetail(String userId) {
        return new Result(false, StatusCode.ERROR,"熔断器启动了");
    }
}
