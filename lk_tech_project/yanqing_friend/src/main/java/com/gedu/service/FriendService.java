package com.gedu.service;

import com.gedu.dao.FriendDao;
import com.gedu.domain.Friend;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class FriendService {

    @Resource
    private FriendDao friendDao;
    public Friend findTop1ByStateOrderByCreatetimeDesc(String state){
       return null;
    }
}
