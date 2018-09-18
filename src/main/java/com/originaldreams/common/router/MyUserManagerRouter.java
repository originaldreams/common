package com.originaldreams.common.router;

/**
 * @author yangkaile
 * @date 2018-09-18 13:46:58
 */
public class MyUserManagerRouter  extends  MyNewRouter{

    public static String serviceName = MyServiceName.USER_MANAGER_CENTER;
    @Override
    public  String getUrl(String router){
        return PREFIX + serviceName + router;
    }

    private static MyUserManagerRouter instance;
    public static MyUserManagerRouter getInstance(){
        if(instance == null){
            instance = new MyUserManagerRouter();
        }
        return instance;
    }

    @Override
    public  void init(){
        initRouter(USER_MANAGER_LOGON);
        initRouter(USER_MANAGER_REGISTER);
        initRouter(USER_MANAGER_USER_INFO_GET);
        initRouter(USER_MANAGER_PERMISSION_GET_ALL_ROUTERS);
        initRouter(USER_MANAGER_PERMISSION_GET_ALL_USERNAME_AND_ROLENAME);
        initRouter(USER_MANAGER_PERMISSION_GET_ROLE_BY_USER_ID);
        initRouter(USER_MANAGER_PERMISSION_GET_USERS_BY_ROLE_ID);
        initRouter(USER_MANAGER_PERMISSION_MANAGER_ADD_ROLE);
        initRouter(USER_MANAGER_PERMISSION_MANAGER_ADD_ROLE_FOR_USER);
        initRouter(USER_MANAGER_PERMISSION_GET_ROUTERS_BY_ROLE_ID);
        initRouter(USER_MANAGER_PERMISSION_MANAGER_DELETE_ROLE_BY_ID);
        initRouter(USER_MANAGER_PERMISSION_MANAGER_UPDATE_ROLE);
        initRouter(USER_MANAGER_PERMISSION_GET_ROLES_BY_ROUTER_ID);
        initRouter(USER_MANAGER_PERMISSION_GET_ROUTER_IDS_BY_USER_ID);
        initRouter(USER_MANAGER_PERMISSION_MANAGER_ADD_ROUTER_FOR_ROLE);
    }


    /**
     * 登录
     * POST
     * userName:String null
     * phone:String null
     * email:String null
     * password:String notNull
     */
    public final MyRouterObject USER_MANAGER_LOGON =
            new MyRouterObject(0,
                    "USER_MANAGER_LOGON",
                    getUrl( "/logon"),
                    REQUEST_METHOD_GET);


    /**
     * 注册
     * POST
     * userName:String null
     * phone:String null
     * email:String null
     * password:String notNull
     */
    public final MyRouterObject USER_MANAGER_REGISTER =
            new MyRouterObject(0,
                    "USER_MANAGER_REGISTER",
                    getUrl( "/register"),
                    REQUEST_METHOD_GET);

    /*
     *用户权限访问
     */

    /**
     * 查询用户的角色
     * GET
     * userId:Integer notNull
     *
     */
    public final MyRouterObject USER_MANAGER_PERMISSION_GET_ROLE_BY_USER_ID =
            new MyRouterObject(10002,
                    "USER_MANAGER_PERMISSION_GET_ROLE_BY_USER_ID",
                    getUrl("/permission/getRoleByUserId"),
                    REQUEST_METHOD_GET);

    /**
     * 查询包含某个权限的角色
     * GET
     * routerId:Integer notNull
     */
    public final MyRouterObject USER_MANAGER_PERMISSION_GET_ROLES_BY_ROUTER_ID =
            new MyRouterObject(10003,
                    "USER_MANAGER_PERMISSION_GET_ROLES_BY_ROUTER_ID",
                    getUrl( "/permission/getRolesByRouterId"),
                    REQUEST_METHOD_GET);

    /**
     * 查询拥有某个角色的用户
     * GET
     * roleId:Integer notNull
     */
    public final MyRouterObject USER_MANAGER_PERMISSION_GET_USERS_BY_ROLE_ID =
            new MyRouterObject(10004,
                    "USER_MANAGER_PERMISSION_GET_USERS_BY_ROLE_ID",
                    getUrl( "/permission/getUsersByRoleId"),
                    REQUEST_METHOD_GET);

    /**
     * 查询所有权限
     * GET
     * null
     */
    public final MyRouterObject USER_MANAGER_PERMISSION_GET_ALL_ROUTERS =
            new MyRouterObject(10005,
                    "USER_MANAGER_PERMISSION_GET_ALL_ROUTERS",
                    getUrl( "/permission/getAllRouters"),
                    REQUEST_METHOD_GET);

    /**
     * 查询某个角色拥有的权限
     * GET
     * roleId:Integer notNull
     */
    public final MyRouterObject USER_MANAGER_PERMISSION_GET_ROUTERS_BY_ROLE_ID =
            new MyRouterObject(10006,
                    "USER_MANAGER_PERMISSION_GET_ROUTERS_BY_ROLE_ID",
                    getUrl("/permission/getRoutersByRoleId")
                    ,REQUEST_METHOD_GET);

    /**
     * 查询某个用户拥有的权限ID
     * GET
     * userId:Integer notNull
     */
    public final MyRouterObject USER_MANAGER_PERMISSION_GET_ROUTER_IDS_BY_USER_ID =
            new MyRouterObject(10007,
                    "USER_MANAGER_PERMISSION_GET_ROUTER_IDS_BY_USER_ID",
                    getUrl( "/permission/getRouterIdsByUserId"),
                    REQUEST_METHOD_GET);

    /*
     * 用户权限管理
     */
    /**
     * 添加角色
     * POST
     * name:String notNull
     * description:String notNull
     */
    public final MyRouterObject USER_MANAGER_PERMISSION_MANAGER_ADD_ROLE =
            new MyRouterObject(20001,
                    "USER_MANAGER_PERMISSION_MANAGER_ADD_ROLE",
                    getUrl("/permissionManager/addRole"),
                    REQUEST_METHOD_POST);

    /**
     * 添加用户的角色
     * POST
     * userId:Integer notNull
     * roleId:Integer notNull
     */
    public final MyRouterObject USER_MANAGER_PERMISSION_MANAGER_ADD_ROLE_FOR_USER =
            new MyRouterObject(20002,
                    "USER_MANAGER_PERMISSION_MANAGER_ADD_ROLE_FOR_USER",
                    getUrl( "/permissionManager/addRoleForUser"),
                    REQUEST_METHOD_POST);

    /**
     * 添加角色的权限
     * POST
     * roleId:Integer notNull
     * routerId:Integer notNull
     */
    public final MyRouterObject USER_MANAGER_PERMISSION_MANAGER_ADD_ROUTER_FOR_ROLE =
            new MyRouterObject(20003,
                    "USER_MANAGER_PERMISSION_MANAGER_ADD_ROUTER_FOR_ROLE",
                    getUrl( "/permissionManager/addRouterForRole"),
                    REQUEST_METHOD_POST);

    /**
     * 删除角色
     * DELETE
     * id:Integer notNull
     */
    public final  MyRouterObject USER_MANAGER_PERMISSION_MANAGER_DELETE_ROLE_BY_ID =
            new MyRouterObject(30000,
                    "USER_MANAGER_PERMISSION_MANAGER_DELETE_ROLE_BY_ID",
                    getUrl( "/permissionManager/deleteRoleById"),
                    REQUEST_METHOD_DELETE);

    /**
     * 修改角色
     * PUT
     * id:Integer notNull
     * name:String notNull
     * description:String null
     */
    public final MyRouterObject USER_MANAGER_PERMISSION_MANAGER_UPDATE_ROLE =
            new MyRouterObject(40000,
                    "USER_MANAGER_PERMISSION_MANAGER_UPDATE_ROLE",
                    getUrl("/permissionManager/updateRole"),
                    REQUEST_METHOD_PUT);


    public final MyRouterObject USER_MANAGER_PERMISSION_GET_ALL_USERNAME_AND_ROLENAME =
            new MyRouterObject(10009,
                    "USER_MANAGER_PERMISSION_GET_ALL_USERNAME_AND_ROLENAME",
                    getUrl( "/permission/getAllUserNameAndRoleName"),
                    REQUEST_METHOD_GET);


    public final MyRouterObject USER_MANAGER_USER_INFO_GET =
            new MyRouterObject(10008,
                    "USER_MANAGER_USER_INFO_GET",
                    getUrl( "/userInfo/get"),
                    REQUEST_METHOD_GET);


}
