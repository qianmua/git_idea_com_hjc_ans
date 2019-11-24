package com.hjc.controller;

import com.google.gson.Gson;
import com.hjc.model.Goods;
import com.hjc.service.impl.GoodsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: HJC
 * Date: 2019/10/30
 * Time: 16:41
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/goodsTest")
public class GoodsController {
    @Autowired
    private GoodsServiceImpl goodsService;

    @RequestMapping("values")
    @ResponseBody
    public String values(){
        System.out.println("controller gooodtest values method.");
        Gson gson = new Gson();
        List<Goods> list = goodsService.queryPageIndex(1,4);
        for (Goods goods:
             list) {
            System.out.println(goods.toString());
        }
        String gsonFormit = gson.toJson(list);
        return gsonFormit;
    }
}
