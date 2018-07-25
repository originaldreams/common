package com.originaldreams.common.router;

import java.util.HashMap;
import java.util.Map;

/**
 * 维护组件为前端提供的接口，这些接口会自动读取到my_core库的router表中
 * 接口命名规则：组件名_Controller上的RequestMapping.value_接口上的RequestMapping.value  首字母大写
 * 新增的接口在这里注册，同时加入到routerMap里
 */
public class MyRouter {
    public final static String Prefix = "http://";

    /*
     * 测试
     */
    /**
     * LogCenter提供的测试http接口
     * GET
     * id: Integer，null
     * name: String，null
     */
    public final static String Log_Http_Get = Prefix + MyServiceName.LogCenter + "/http/get";

    /**
     * LogCenter提供的测试http接口
     * POST
     * id: Integer，notNull
     * name: String，notNull
     */
    public final static String Log_Http_Post = Prefix + MyServiceName.LogCenter + "/http/post";

    /**
     * 登录
     * POST
     * userName:String null
     * phone:String null
     * email:String null
     * password:String notNull
     */
    public final static String UserManager_Logon = Prefix + MyServiceName.UserManagerCenter + "/logon";

    /**
     * 注册
     * POST
     * userName:String null
     * phone:String null
     * email:String null
     * password:String notNull
     */
    public final static String UserManager_Register = Prefix + MyServiceName.UserManagerCenter + "/register";

    /*
     *用户权限访问
     */
    /**
     * 查询所有角色
     * GET
     * null
     */
    public final static String UserManager_Permission_GetAllRoles               = Prefix + MyServiceName.UserManagerCenter + "/permission/getAllRoles";
    /**
     * 查询用户的角色
     * GET
     * userId:Integer notNull
     *
     */
    public final static String UserManager_Permission_GetRolesByUserId          = Prefix + MyServiceName.UserManagerCenter + "/permission/getRolesByUserId";
    /**
     * 查询包含某个权限的角色
     * GET
     * routerId:Integer notNull
     */
    public final static String UserManager_Permission_GetRolesByRouterId        = Prefix + MyServiceName.UserManagerCenter + "/permission/getRolesByRouterId";
    /**
     * 查询拥有某个角色的用户
     * GET
     * roleId:Integer notNull
     */
    public final static String UserManager_Permission_GetUsersByRoleId          = Prefix + MyServiceName.UserManagerCenter + "/permission/getUsersByRoleId";
    /**
     * 查询所有权限
     * GET
     * null
     */
    public final static String UserManager_Permission_GetAllRouters             = Prefix + MyServiceName.UserManagerCenter + "/permission/getAllRouters";
    /**
     * 查询某个角色拥有的权限 getRouterIdsByUserId
     * GET
     * roleId:Integer notNull
     */
    public final static String UserManager_Permission_GetRoutersByRoleId        = Prefix + MyServiceName.UserManagerCenter + "/permission/getRoutersByRoleId";

    /**
     * 查询某个用户拥有的权限
     * GET
     * userId:Integer notNull
     */
    public final static String UserManager_Permission_GetRouterIdsByUserId      = Prefix + MyServiceName.UserManagerCenter + "/permission/getRouterIdsByUserId";


    /*
     * 用户权限管理
     */
    /**
     * 添加角色
     * POST
     * name:String notNull
     * description:String notNull
     */
    public final static String UserManager_PermissionManager_addRole            = Prefix + MyServiceName.UserManagerCenter + "/permissionManager/addRole";
    /**
     * 添加用户的角色
     * POST
     * userId:Integer notNull
     * roleId:Integer notNull
     */
    public final static String UserManager_PermissionManager_addRoleForUser     = Prefix + MyServiceName.UserManagerCenter + "/permissionManager/addRoleForUser";
    /**
     * 添加角色的权限
     * POST
     * roleId:Integer notNull
     * routerId:Integer notNull
     */
    public final static String UserManager_PermissionManager_addRouterForRole   = Prefix + MyServiceName.UserManagerCenter + "/permissionManager/addRouterForRole";

    /**
     * 删除角色
     * DELETE
     * id:Integer notNull
     */
    public final static String UserManager_PermissionManager_deleteRoleById     = Prefix + MyServiceName.UserManagerCenter + "/permissionManager/deleteRoleById";

    /**
     * 修改角色
     * PUT
     * id:Integer notNull
     * name:String notNull
     * description:String null
     */
    public final static String UserManager_PermissionManager_updateRole         = Prefix + MyServiceName.UserManagerCenter + "/permissionManager/updateRole";

    public  static Map<String ,MyRouterObject> routerMap = new HashMap<>();

    /**
     * 初始化routerMap
     * 这个在添加新的router时要仔细检查，服务启动时会根据routerMap来初始化路由表
     */
    static{

        routerMap.put("LogCenter_Http_Get",                             new MyRouterObject(1000, Log_Http_Get));
        routerMap.put("LogCenter_Http_POST",                            new MyRouterObject(1001, Log_Http_Post));

        routerMap.put("UserManager_Permission_GetAllRoles",             new MyRouterObject(2000, UserManager_Permission_GetAllRoles));
        routerMap.put("UserManager_Permission_GetRolesByUserId",        new MyRouterObject(2001, UserManager_Permission_GetRolesByUserId));
        routerMap.put("UserManager_Permission_GetRolesByRouterId",      new MyRouterObject(2002, UserManager_Permission_GetRolesByRouterId));
        routerMap.put("UserManager_Permission_GetUsersByRoleId",        new MyRouterObject(2003, UserManager_Permission_GetUsersByRoleId));
        routerMap.put("UserManager_Permission_GetAllRouters",           new MyRouterObject(2004, UserManager_Permission_GetAllRouters));
        routerMap.put("UserManager_Permission_GetRoutersByRoleId",      new MyRouterObject(2005, UserManager_Permission_GetRoutersByRoleId));
        routerMap.put("UserManager_Permission_GetRouterIdsByUserId",    new MyRouterObject(2006, UserManager_Permission_GetRouterIdsByUserId));


        routerMap.put("UserManager_PermissionManager_addRole",          new MyRouterObject(2100, UserManager_PermissionManager_addRole));
        routerMap.put("UserManager_PermissionManager_addRoleForUser",   new MyRouterObject(2101, UserManager_PermissionManager_addRoleForUser));
        routerMap.put("UserManager_PermissionManager_addRouterForRole", new MyRouterObject(2102, UserManager_PermissionManager_addRouterForRole));
        routerMap.put("UserManager_PermissionManager_deleteRoleById",   new MyRouterObject(2103, UserManager_PermissionManager_deleteRoleById));
        routerMap.put("UserManager_PermissionManager_updateRole",       new MyRouterObject(2104, UserManager_PermissionManager_updateRole));

    }

}
