package com.originaldreams.common.router;

/**
 * @author yangkaile
 * @date 2018-09-18 14:51:05
 */
public class MyPublicServiceRouter extends MyNewRouter{

    public final String serviceName = MyServiceName.PUBLIC_SERVICE_CENTER;
    @Override
    public  String getUrl(String router){
        return PREFIX + serviceName + router;
    }
    @Override
    public void init(){
        initRouter(PUBLIC_SERVICE_SMS_SEND_VERIFICATIONCODE);
    }

    private static MyPublicServiceRouter instance;
    public static MyPublicServiceRouter getInstance(){
        if(instance == null){
            instance = new MyPublicServiceRouter();
        }
        return instance;
    }
    /**
     * 发送短信验证码
     * GER
     * phone:String notNull
     */
    public final  MyRouterObject PUBLIC_SERVICE_SMS_SEND_VERIFICATIONCODE =
            new MyRouterObject(0,
                    "PUBLIC_SERVICE_SMS_SEND_VERIFICATIONCODE",
                    getUrl("/SMS/sendVerificationCode"),
                    REQUEST_METHOD_GET);



}
