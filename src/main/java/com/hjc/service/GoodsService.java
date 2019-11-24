package com.hjc.service;

import com.hjc.model.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: HJC
 * Date: 2019/10/30
 * Time: 15:35
 * To change this template use File | Settings | File Templates.
 */
public interface GoodsService {

    int deleteGoodsOne(int gid);

    int updateGoodsOne(Goods goods);

    int insertGoodsOne(Goods goods);

    List<Goods> queryAllGoods();

    List<Goods> queryPageIndex(@Param("initIndex") int initIndex, @Param("count") int count );
}
