package com.cai.conllter;

import com.cai.model.activity;
import com.cai.model.pagevo;
import com.cai.model.user;
import com.cai.servicers.activityservice;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import utils.DateTimeUtil;
import utils.UUIDUtil;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/activity")
public class activityconlter {
    @Resource
    private activityservice activityservice;
    @RequestMapping(value = "/getuserlist.do")
    @ResponseBody
    public List getuserlist(){
        List list=null;
        list=activityservice.selectuser();
        return  list;
    }
    @RequestMapping(value = "/insertactivity.do")
    @ResponseBody
    public  activity insertactivity(HttpServletRequest request, String owner, String name, String startDate, String endDate, String cost, String description){
        activity a =new activity();
        user user=(user)request.getSession().getAttribute("user");
        a.setOwner(owner);
        a.setName(name);
        a.setDescription(description);
        a.setCost(cost);
        a.setStartDate(startDate);
        a.setEndDate(endDate);
        a.setId(UUIDUtil.getUUID());
        a.setCreateTime(DateTimeUtil.getSysTime());
        a.setCreateBy(user.getName());
        System.out.println(a);
        int i =activityservice.insertactivity(a);
        return a;
    }
    @RequestMapping(value = "/pagelist.do")
    @ResponseBody
    public pagevo pagelist(Integer pagenum,Integer pagesize,String name,String owner,String starttime,String endtime){
        Map<String,Object> map=new HashMap<>();
        map.put("name",name);
        map.put("owner",owner);
        map.put("starttime",starttime);
        map.put("endtime",endtime);
        map.put("pagenum",(pagenum-1)*pagesize);
        map.put("pagesize",pagesize);
        pagevo pagevo=activityservice.pagelist(map);
        return pagevo;
    }
}
