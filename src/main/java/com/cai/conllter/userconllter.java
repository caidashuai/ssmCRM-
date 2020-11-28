package com.cai.conllter;


import com.cai.model.user;
import com.cai.servicers.servicersimpl.userserviceImpl;
import com.cai.servicers.userservice;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import utils.MD5Util;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping(value = "/user")
public class userconllter {
    @Resource
    private userservice userservice;
    @RequestMapping(value = "/login.do")
    @ResponseBody
    public user userlogin(HttpServletRequest request, String loginname, String loginpwd){
        loginpwd=MD5Util.getMD5(loginpwd);
        user usererror=new user();
        usererror.setLoginAct("错误的账户,请检查密码或者账户");
        user user1=userservice.loginuser(loginname,loginpwd);
        if (user1!=null){
            request.getSession().setAttribute("user",user1);
            return user1;
        }
        return usererror;

    }
}
