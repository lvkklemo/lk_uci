package com.gedu.service;

import com.gedu.dao.RecruitDao;
import com.gedu.domain.Recruit;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;

@Service
public class RecruitService {

    @Resource
    private RecruitDao recruitDao;
    public Recruit findTop1ByStateOrderByCreatetimeDesc(String state){
       return recruitDao.findTop1ByStateOrderByCreatetimeDesc(state);
    }
}
