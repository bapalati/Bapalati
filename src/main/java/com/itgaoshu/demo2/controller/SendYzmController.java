package com.itgaoshu.demo2.controller;

import com.itgaoshu.demo2.util.CreateYZM;
import com.itgaoshu.demo2.util.New;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendYzmController {
    @RequestMapping("/sendSms")
    public String sendYzm(String phoneNumber,int flag){
        String yzm= CreateYZM.getYZM();
        boolean result= New.zhuce(phoneNumber,yzm,flag);
        if(result){
            return yzm;
        }
        return "";
    }
}
