package com.cai.servicers.servicersimpl;

import com.cai.dao.userdao;
import com.cai.model.user;
import com.cai.servicers.userservice;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class userserviceImpl implements userservice {
    @Resource
    private userdao userdao;
    @Override
    public user loginuser(String username, String pwd) {
      user user=new user();
        if (user!=null){
             user=userdao.login(username,pwd);
        }
        return user;
    }
}
