package com.itgaoshu.demo2.util;

public class CreateYZM {
    public static String getYZM(){
        String YZM="";
        for(int i=1;i<=6;i++){
            YZM+=(int)Math.floor(Math.random()*10);
        }
        return YZM;
    }
}
