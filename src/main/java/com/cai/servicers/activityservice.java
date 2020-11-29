package com.cai.servicers;

import com.cai.model.activity;
import com.cai.model.user;

import java.util.List;

public interface activityservice {
    List<user> selectuser();
    int insertactivity(activity a);
}
