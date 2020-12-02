package com.cai.servicers;

import com.cai.model.activity;
import com.cai.model.pagevo;
import com.cai.model.user;

import java.util.List;
import java.util.Map;

public interface activityservice {
    List<user> selectuser();
    int insertactivity(activity a);
    pagevo pagelist(Map map);
}
