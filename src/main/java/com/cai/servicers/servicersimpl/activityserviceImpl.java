package com.cai.servicers.servicersimpl;

import com.cai.dao.activitydao;
import com.cai.model.activity;
import com.cai.model.user;
import com.cai.servicers.activityservice;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class activityserviceImpl implements activityservice {
    @Resource
    private activitydao activitydao;
    @Override
    public List<user> selectuser() {
        List<user> list=activitydao.selectuser();
        return list;
    }

    @Override
    public int insertactivity(activity a) {
        int i =activitydao.insertactivity(a);
        return i;
    }

}
