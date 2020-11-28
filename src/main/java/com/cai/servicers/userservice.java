package com.cai.servicers;

import com.cai.model.user;
import org.springframework.stereotype.Service;

import java.util.List;

public interface userservice {

    List<user> selectuser();
    user loginuser(String username,String pwd);
}
