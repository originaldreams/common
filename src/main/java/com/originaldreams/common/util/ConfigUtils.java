package com.originaldreams.common.util;

/**
 * 配置类，存储系统用到的一些常量和配置参数
 */
public class ConfigUtils {

    /**
     * HTTP地址前缀
     */
    public final static String HTTP_UTL_PREFIX = "http://";

    /**
     * get请求
     */
    public final static String REQUEST_METHOD_GET = "GET";
    /**
     * post请求
     */
    public final static String REQUEST_METHOD_POST = "POST";
    /**
     * delete 请求
     */
    public final static String REQUEST_METHOD_DELETE = "DELETE";
    /**
     * put请求
     */
    public final static String REQUEST_METHOD_PUT = "PUT";

    /**
     * 允许的单个组件的路由上限（每个组件的最大接口数）
     * 这个值不能随意调整，
     */
    public final static int SERVICE_ROUTER_MAX      = 1000;
    public final static int ROUTER_ID_USER_MANAGER = 10;
    public final static int ROUTER_ID_LOG            = 20;
    public final static int ROUTER_ID_PUBLIC_SERVICE = 30;


    /**
     * session保存用户ID的key值
     */
    public final static String SESSION_USER_ID_KEY = "id";

    /**
     * Response里返回码的键值
     */
    public final static String RESPONSE_RESULT_CODE_KEY = "success";

    /**
     * Response里表示成功的返回码
     */
    public final static int RESPONSE_RESULT_CODE_SUCCESS_VALUE = 0;
}
