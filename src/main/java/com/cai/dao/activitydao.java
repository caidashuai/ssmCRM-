package com.cai.dao;

import com.cai.model.activity;
import com.cai.model.user;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface activitydao {
    List selectuser();
    int insertactivity(activity a);
    List<activity> pageavtivity(Map map);
    int pageavttivitytotol(Map map);
}
