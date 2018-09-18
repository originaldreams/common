package com.originaldreams.common.router;

/**
 * @author yangkaile
 * @date 2018-09-18 13:41:49
 */
public class MyLogRouter extends MyNewRouter {
    public  String serviceName = MyServiceName.LOG_CENTER;
    @Override
    public  String getUrl(String router){
        return PREFIX + serviceName + router;
    }
    private static MyLogRouter instance;
    public static MyLogRouter getInstance(){
        if(instance == null){
            instance = new MyLogRouter();
        }
        return instance;
    }

    @Override
    public  void init(){
        initRouter(LOG_HTTP_GET);
        initRouter(LOG_HTTP_POST);
        initRouter(LOG_LOGON_LOG_INSERT);
        initRouter(LOG_SMS_LOG_INSERT);
        initRouter(LOG_SMSLOG_CHECK_AND_UPDATE_STATE);
    }


    /**
     * LogCenter提供的测试http接口
     * GET
     * id: Integer，null
     * name: String，null
     */
    public final  MyRouterObject LOG_HTTP_GET =
            new MyRouterObject(10000,
                    "LOG_HTTP_GET",
                    getUrl("/http/get"),
                    REQUEST_METHOD_GET);


    /**
     * LogCenter提供的测试http接口
     * POST
     * id: Integer，notNull
     * name: String，notNull
     */
    public final  MyRouterObject LOG_HTTP_POST =
            new MyRouterObject(20000,
                    "LOG_HTTP_POST",
                    getUrl("/http/post"),
                    REQUEST_METHOD_POST);


    /**
     * 验证短信验证码是否正确
     * GET
     * phone 手机号 notNull
     * codeStr 验证码 notNull
     */
    public final  MyRouterObject LOG_SMSLOG_CHECK_AND_UPDATE_STATE =
            new MyRouterObject(0,
                    "LOG_SMSLOG_CHECK_AND_UPDATE_STATE",
                    getUrl("/smsLog/checkAndUpdateState"),
                    REQUEST_METHOD_GET);

    /**
     * 添加用户登录日志
     * POST
     * userId:Integer notNull
     * type:Integer notNull
     * way:Integer notNull
     * ip:String null
     * deviceId:String null
     */
    public final  MyRouterObject LOG_LOGON_LOG_INSERT =
            new MyRouterObject(0,
                    "LOG_LOGON_LOG_INSERT",
                    getUrl("/logonLog/insert"),REQUEST_METHOD_GET);

    /**
     * 添加短信发送日志
     * POST
     * phone:String notNull
     * type:Integer notNull
     * templateId:String notNull
     * codeStr:String notNull
     * minuteStr:String notNull
     * result:String notNull
     * stateCode:String notNull
     */
    public final  MyRouterObject LOG_SMS_LOG_INSERT =
            new MyRouterObject(0,
                    "LOG_SMS_LOG_INSERT",
                    getUrl( "/smsLog/insert"),REQUEST_METHOD_GET);

}
