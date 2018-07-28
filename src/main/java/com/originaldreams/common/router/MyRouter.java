package com.originaldreams.common.router;

import java.util.HashMap;
import java.util.Map;

/**
 * 维护组件为前端提供的接口，这些接口会自动读取到my_core库的router表中
 * 接口命名规则：组件名_Controller上的RequestMapping.value_接口上的RequestMapping.value  首字母大写
 * 新增的接口在这里注册，同时加入到routerMap里
 */
public class MyRouter {
    public final static String PREFIX = "http://";

    /*
     * 测试
     */
    /**
     * LogCenter提供的测试http接口
     * GET
     * id: Integer，null
     * name: String，null
     */
    public final static String LOG_HTTP_GET = PREFIX + MyServiceName.LOG_CENTER + "/http/get";

    /**
     * LogCenter提供的测试http接口
     * POST
     * id: Integer，notNull
     * name: String，notNull
     */
    public final static String LOG_HTTP_POST = PREFIX + MyServiceName.LOG_CENTER + "/http/post";

    /**
     * 登录
     * POST
     * userName:String null
     * phone:String null
     * email:String null
     * password:String notNull
     */
    public final static String USER_MANAGER_LOGON = PREFIX + MyServiceName.USER_MANAGER_CENTER + "/logon";

    /**
     * 注册
     * POST
     * userName:String null
     * phone:String null
     * email:String null
     * password:String notNull
     */
    public final static String USER_MANAGER_REGISTER = PREFIX + MyServiceName.USER_MANAGER_CENTER + "/register";

    /*
     *用户权限访问
     */
    /**
     * 查询所有角色
     * GET
     * null
     */
    public final static String USER_MANAGER_PERMISSION_GET_ALL_ROLES =
            PREFIX + MyServiceName.USER_MANAGER_CENTER + "/permission/getAllRoles";
    /**
     * 查询用户的角色
     * GET
     * userId:Integer notNull
     *
     */
    public final static String USER_MANAGER_PERMISSION_GET_ROLES_BY_USER_ID =
            PREFIX + MyServiceName.USER_MANAGER_CENTER + "/permission/getRolesByUserId";
    /**
     * 查询包含某个权限的角色
     * GET
     * routerId:Integer notNull
     */
    public final static String USER_MANAGER_PERMISSION_GET_ROLES_BY_ROUTER_ID =
            PREFIX + MyServiceName.USER_MANAGER_CENTER + "/permission/getRolesByRouterId";
    /**
     * 查询拥有某个角色的用户
     * GET
     * roleId:Integer notNull
     */
    public final static String USER_MANAGER_PERMISSION_GET_USERS_BY_ROLE_ID =
            PREFIX + MyServiceName.USER_MANAGER_CENTER + "/permission/getUsersByRoleId";
    /**
     * 查询所有权限
     * GET
     * null
     */
    public final static String USER_MANAGER_PERMISSION_GET_ALL_ROUTERS =
            PREFIX + MyServiceName.USER_MANAGER_CENTER + "/permission/getAllRouters";
    /**
     * 查询某个角色拥有的权限 getRouterIdsByUserId
     * GET
     * roleId:Integer notNull
     */
    public final static String USER_MANAGER_PERMISSION_GET_ROUTERS_BY_ROLE_ID =
            PREFIX + MyServiceName.USER_MANAGER_CENTER + "/permission/getRoutersByRoleId";

    /**
     * 查询某个用户拥有的权限
     * GET
     * userId:Integer notNull
     */
    public final static String USER_MANAGER_PERMISSION_GET_ROUTER_IDS_BY_USER_ID =
            PREFIX + MyServiceName.USER_MANAGER_CENTER + "/permission/getRouterIdsByUserId";


    /*
     * 用户权限管理
     */
    /**
     * 添加角色
     * POST
     * name:String notNull
     * description:String notNull
     */
    public final static String USER_MANAGER_PERMISSION_MANAGER_ADD_ROLE =
            PREFIX + MyServiceName.USER_MANAGER_CENTER + "/permissionManager/addRole";
    /**
     * 添加用户的角色
     * POST
     * userId:Integer notNull
     * roleId:Integer notNull
     */
    public final static String USER_MANAGER_PERMISSION_MANAGER_ADD_ROLE_FOR_USER =
            PREFIX + MyServiceName.USER_MANAGER_CENTER + "/permissionManager/addRoleForUser";
    /**
     * 添加角色的权限
     * POST
     * roleId:Integer notNull
     * routerId:Integer notNull
     */
    public final static String USER_MANAGER_PERMISSION_MANAGER_ADD_ROUTER_FOR_ROLE =
            PREFIX + MyServiceName.USER_MANAGER_CENTER + "/permissionManager/addRouterForRole";

    /**
     * 删除角色
     * DELETE
     * id:Integer notNull
     */
    public final static String USER_MANAGER_PERMISSION_MANAGER_DELETE_ROLE_BY_ID =
            PREFIX + MyServiceName.USER_MANAGER_CENTER + "/permissionManager/deleteRoleById";

    /**
     * 修改角色
     * PUT
     * id:Integer notNull
     * name:String notNull
     * description:String null
     */
    public final static String USER_MANAGER_PERMISSION_MANAGER_UPDATE_ROLE =
            PREFIX + MyServiceName.USER_MANAGER_CENTER + "/permissionManager/updateRole";

    public final static String USER_MANAGER_USER_INFO_GET =
            PREFIX + MyServiceName.USER_MANAGER_CENTER + "/userInfo/get";
    /**
     * 保存所有的权限
     * Key:MethodName 客户端访问所有权限都要根据方法名访问
     * Value:权限
     */
    public  static Map<String, MyRouterObject> routerMap = new HashMap<>();

    /**
     * 初始化routerMap
     * 这个在添加新的router时要仔细检查，服务启动时会根据routerMap来初始化路由表
     */
    static{

        routerMap.put("LOG_HTTP_GET",
                new MyRouterObject(1000, LOG_HTTP_GET));
        routerMap.put("LOG_HTTP_POST",
                new MyRouterObject(1001, LOG_HTTP_POST));

        routerMap.put("USER_MANAGER_PERMISSION_GET_ALL_ROLES",
                new MyRouterObject(2000, USER_MANAGER_PERMISSION_GET_ALL_ROLES));
        routerMap.put("USER_MANAGER_PERMISSION_GET_ROLES_BY_USER_ID",
                new MyRouterObject(2001, USER_MANAGER_PERMISSION_GET_ROLES_BY_USER_ID));
        routerMap.put("USER_MANAGER_PERMISSION_GET_ROLES_BY_ROUTER_ID",
                new MyRouterObject(2002, USER_MANAGER_PERMISSION_GET_ROLES_BY_ROUTER_ID));
        routerMap.put("USER_MANAGER_PERMISSION_GET_USERS_BY_ROLE_ID",
                new MyRouterObject(2003, USER_MANAGER_PERMISSION_GET_USERS_BY_ROLE_ID));
        routerMap.put("USER_MANAGER_PERMISSION_GET_ALL_ROUTERS",
                new MyRouterObject(2004, USER_MANAGER_PERMISSION_GET_ALL_ROUTERS));
        routerMap.put("USER_MANAGER_PERMISSION_GET_ROUTERS_BY_ROLE_ID",
                new MyRouterObject(2005, USER_MANAGER_PERMISSION_GET_ROUTERS_BY_ROLE_ID));
        routerMap.put("USER_MANAGER_PERMISSION_GET_ROUTER_IDS_BY_USER_ID",
                new MyRouterObject(2006, USER_MANAGER_PERMISSION_GET_ROUTER_IDS_BY_USER_ID));


        routerMap.put("USER_MANAGER_PERMISSION_MANAGER_ADD_ROLE",
                new MyRouterObject(2100, USER_MANAGER_PERMISSION_MANAGER_ADD_ROLE));
        routerMap.put("USER_MANAGER_PERMISSION_MANAGER_ADD_ROLE_FOR_USER",
                new MyRouterObject(2101, USER_MANAGER_PERMISSION_MANAGER_ADD_ROLE_FOR_USER));
        routerMap.put("USER_MANAGER_PERMISSION_MANAGER_ADD_ROUTER_FOR_ROLE",
                new MyRouterObject(2102, USER_MANAGER_PERMISSION_MANAGER_ADD_ROUTER_FOR_ROLE));
        routerMap.put("USER_MANAGER_PERMISSION_MANAGER_DELETE_ROLE_BY_ID",
                new MyRouterObject(2103, USER_MANAGER_PERMISSION_MANAGER_DELETE_ROLE_BY_ID));
        routerMap.put("USER_MANAGER_PERMISSION_MANAGER_UPDATE_ROLE",
                new MyRouterObject(2104, USER_MANAGER_PERMISSION_MANAGER_UPDATE_ROLE));

        routerMap.put("USER_MANAGER_USER_INFO_GET",
                new MyRouterObject(2200, USER_MANAGER_USER_INFO_GET));

    }

    /**
     * 根据MethodName获取Router
     * @param methodName
     * @return
     */
    public static MyRouterObject getRouterByMethodName(String methodName){
        if(methodName == null)
            return null;

        MyRouterObject routerObject  = MyRouter.routerMap.get(methodName);
        return routerObject;
    }

    /**
     * 根据MethodName获取RouterUrl
     * @param methodName
     * @return
     */
    public static String  getRouterUrlByMethodName(String methodName){
        if(methodName == null)
            return null;

        String routerUrl = MyRouter.routerMap.get(methodName).getRouterUrl();
        if(routerUrl == null || routerUrl.equals("")){
            return null;
        }
        return routerUrl;
    }
}
