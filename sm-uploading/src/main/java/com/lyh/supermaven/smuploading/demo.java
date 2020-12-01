package com.lyh.supermaven.smuploading;

import com.obs.services.ObsClient;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author LYuanHao
 * @date 2020/11/30 15:47
 * @JDK 1.8
 */
public class demo {
    public static void main(String[] args) {
        String endPoint = "obs.cn-south-1.myhuaweicloud.com";
        String ak = "NPTUOR0JXYDUEPHS12DV";
        String sk = "4eFKu71wj5wDl6vddm7i3EbKu73hJoSZh0kCz99O";
        ObsClient obsClient=new ObsClient(ak,sk,endPoint);
        String content = "Hello OBS";
//        obsClient.putObject("newmaven","objectname",new ByteArrayInputStream(content.getBytes()));
        obsClient.putObject("newmaven","newFile",new File("C:\\Users\\ConStanyin\\OneDrive\\Pictures\\3597df83145ee0d0e6341b65b650d731.jpg"));
    }



}
