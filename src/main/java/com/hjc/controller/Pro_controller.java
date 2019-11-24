package com.hjc.controller;

import com.hjc.model.Init_info;
import com.hjc.service.impl.GoodsServiceImpl;
import com.hjc.service.impl.InfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: HJC
 * Date: 2019/10/21
 * Time: 22:38
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/ssm")
public class Pro_controller {

    @Autowired
    private InfoServiceImpl infoService;
//    @Autowired
//    private GoodsServiceImpl goodsService;
    @RequestMapping("index")
    public String index(){
        System.out.println("hello,world!");
        List<Init_info> list = null;
        list = infoService.queryAllInfo();
        for (Init_info init:
             list) {
            System.out.println(init.toString());
        }
        return "index_page";
    }
    @RequestMapping("login")
    public String login(String ids ,String passwords){
        System.out.println(ids + "" + passwords);
        Init_info init_info = infoService.queryInfo(Integer.valueOf(ids),passwords);
        System.out.println(init_info.toString());
        if(init_info != null){
            return "index_page";
        }
        return "../../index";
    }
}
