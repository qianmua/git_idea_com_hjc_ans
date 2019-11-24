package com.hjc.ui;

import com.hjc.model.Init_info;
import com.hjc.service.impl.InfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: HJC
 * Date: 2019/10/25
 * Time: 9:08
 * To change this template use File | Settings | File Templates.
 */

public class ClassCode {

    @Autowired
    private InfoServiceImpl infoService;

    public static void myUUID(){
        try {
            String message = URLEncoder.encode("中文","utf-8");
            System.out.println(message);
            message = URLDecoder.decode(message,"utf-8");
            System.out.println(message);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
    public void list(){
        List<Init_info> list = infoService.queryAllInfo();
        System.out.println(list);
    }
}
