package com.hjc.service;

import com.hjc.model.Init_info;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: HJC
 * Date: 2019/10/23
 * Time: 16:10
 * To change this template use File | Settings | File Templates.
 */
public interface InitService {
    int addInfo(Init_info initInfo);
    int deleteInfo(int id);
    int updateInfo(Init_info initInfo);
    Init_info queryInfo(@Param("ids") int id, @Param("passwords") String psw);
    List<Init_info> queryAllInfo();
}
