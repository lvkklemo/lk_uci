package com.gedu.dao;

import com.gedu.domain.Recruit;

import java.util.List;

public interface RecruitDao {
    public Recruit findTop1ByStateOrderByCreatetimeDesc(String state);
}
