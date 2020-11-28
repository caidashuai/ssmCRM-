package com.cai.dao;

import com.cai.model.user;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface userdao {
    List<user> selectuser();
    user login(@Param("name") String username, @Param("pwd") String userpwd);
}
