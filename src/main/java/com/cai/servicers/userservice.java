package com.cai.servicers;

import com.cai.model.activity;
import com.cai.model.user;
import org.springframework.stereotype.Service;

import java.util.List;

public interface userservice {


    user loginuser(String username,String pwd);

}
