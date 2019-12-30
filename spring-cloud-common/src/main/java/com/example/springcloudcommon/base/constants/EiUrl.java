package com.example.springcloudcommon.base.constants;

/**
 * EI请求地址
 * @author xu
 */
public class EiUrl {


    //EI请求地址
    private static String requestHost = "http://119.3.168.19:9589";
    //EI回调地址
    private static String responseHost = "http://117.78.11.14:30000";

    //EI人脸设置认证参数
    public static String ak = "WVPB5ZNQYQMK2IQTODNH";
    public static String sk = "LlBoS2d26AkR1BCvyO4BkwrsjWbMarJ3ApeEt1G0";
    public static String projectId = "0f21ef9bf57645ed90c6f6c267eb2190";
    //Service info
    public static String url = "https://face.cn-south-1.myhuaweicloud.com";
    public static String region = "cn-south-1";

    //测试标识(测试环境用的标识，正式环境请将此参数改为false)
    public static final boolean TEST_SIGN = true;

    //请求地址
    //入侵请求地址
    public static String intrusiondetectUrl = requestHost+"/v1/intrusiondetect/tasks/";
    //客流请求地址
    public static  String passengerFlowUrl = requestHost+"/v1/passengerFlow/tasks/";
    //布控任务请求地址
    public static  String facetrackUrl =requestHost+"/v1/facetrack/tasks/";
    //EI寻人请求地址
    public static  String findPersonUrl = requestHost+"/v1/facetrack/search";

    //回调地址
    //入侵回调地址
    public static String intrusiondetectCallack = responseHost+"/system/mqs/intrusiondetect/callback";
    //客流回调地址
    public static String passengerFlowCallack=responseHost+"/system/api/mqs/person_stat/callback";
    //布控任务回调地址
    public static String facetrackCallack =responseHost+"/system/mqs/facetrack/callback";



}
