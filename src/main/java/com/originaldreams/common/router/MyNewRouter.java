package com.originaldreams.common.router;

/**
 * 维护组件为前端提供的接口，这些接口会自动读取到my_core库的router表中
 * 接口命名规则：组件名_Controller上的RequestMapping.value_接口上的RequestMapping.value  首字母大写
 * 新增的接口在这里注册，同时加入到routerMap里
 * @author 杨凯乐
 * @date 2018-07-30 09:25:42
 */
public abstract class MyNewRouter {
    public final static String PREFIX = "http://";

    public final static String REQUEST_METHOD_GET = "GET";
    public final static String REQUEST_METHOD_POST = "POST";
    public final static String REQUEST_METHOD_DELETE = "DELETE";
    public final static String REQUEST_METHOD_PUT = "PUT";

    /**
     * 通过组件内路由获取到完整的routerUrl
     * @param router 组件内的路由 如 /http/post
     * @return 如 http://LogCenter/http/post
     */
    public abstract String getUrl(String router);

    /**
     * 初始化路由表，在这个方法里依次调用initRouter方法，将所有的路由加载进来
     */
    public abstract void init();

    public  void initRouter(MyRouterObject router){
        Routers.routerMap.put(router.getName(),router);
    }

}
