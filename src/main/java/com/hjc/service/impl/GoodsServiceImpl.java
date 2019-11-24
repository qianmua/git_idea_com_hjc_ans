package com.hjc.service.impl;

import com.hjc.dao.GoodsDao;
import com.hjc.model.Goods;
import com.hjc.service.GoodsService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: HJC
 * Date: 2019/10/30
 * Time: 15:36
 * To change this template use File | Settings | File Templates.
 */
@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsDao goodsDao;

    @Override
    public int deleteGoodsOne(int gid) {
        return goodsDao.deleteGoodsOne(gid);
    }

    @Override
    public int updateGoodsOne(Goods goods) {
        return goodsDao.updateGoodsOne(goods);
    }

    @Override
    public int insertGoodsOne(Goods goods) {
        return goodsDao.insertGoodsOne(goods);
    }

    @Override
    public List<Goods> queryAllGoods() {
        return goodsDao.queryAllGoods();
    }

    @Override
    public List<Goods> queryPageIndex(int initIndex, int count) {
        return goodsDao.queryPageIndex(initIndex,count);
    }


}
