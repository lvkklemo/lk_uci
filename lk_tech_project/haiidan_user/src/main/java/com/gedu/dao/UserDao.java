package com.gedu.dao;
import com.gedu.domain.User;

import java.util.List;

public interface UserDao {

    public List<User> findAllUser();

    public User findDetail(String userId);
}
