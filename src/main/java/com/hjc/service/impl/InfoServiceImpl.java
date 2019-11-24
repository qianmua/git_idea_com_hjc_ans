package com.hjc.service.impl;

import com.hjc.dao.InfoDao;
import com.hjc.model.Init_info;
import com.hjc.service.InitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: HJC
 * Date: 2019/10/23
 * Time: 16:15
 * To change this template use File | Settings | File Templates.
 */
@Service
public class InfoServiceImpl implements InitService {

    @Autowired
    private InfoDao infoDao;
    @Override
    public int addInfo(Init_info initInfo) {
        return infoDao.addInfo(initInfo);
    }

    @Override
    public int deleteInfo(int id) {
        return infoDao.deleteInfo(id);
    }

    @Override
    public int updateInfo(Init_info initInfo) {
        return infoDao.updateInfo(initInfo);
    }

    @Override
    public Init_info queryInfo(int id, String psw) {
        return infoDao.queryInfo(id,psw);
    }


    @Override
    public List<Init_info> queryAllInfo() {
        System.out.println("test1");
        return infoDao.queryAllInfo();
    }
}
