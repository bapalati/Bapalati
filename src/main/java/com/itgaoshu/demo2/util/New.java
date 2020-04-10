package com.itgaoshu.demo2.util;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;

public class New {
    public static boolean zhuce(String phoneNumber,String yzm,int flag) {
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "LTAI4Futdief7Phwchq8BS84", "VN40aav7wSUsZw6W2XgFG3ykncnyR7");
        IAcsClient client = new DefaultAcsClient(profile);

        CommonRequest request = new CommonRequest();
        request.setMethod(MethodType.POST);
        request.setDomain("dysmsapi.aliyuncs.com");
        request.setVersion("2017-05-25");
        request.setAction("SendSms");
        request.putQueryParameter("RegionId", "cn-hangzhou");
        //手机号
        request.putQueryParameter("PhoneNumbers", phoneNumber);
        //签名
        request.putQueryParameter("SignName", "新漫之家");
        //发送验证码
        request.putQueryParameter("TemplateParam", "{\"code\":\""+yzm+"\"}");
        if(flag==1){
            //注册模板编码
            //127743557
            //SMS_187561120
            request.putQueryParameter("TemplateCode", "SMS_187561120");
        }else{
            //登录模板编码
            //127753582
            //SMS_187591081
            request.putQueryParameter("TemplateCode", "SMS_187591081");
        }
        try {
            CommonResponse response = client.getCommonResponse(request);
            System.out.println(response.getData());
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }
        return false;
    }

}
