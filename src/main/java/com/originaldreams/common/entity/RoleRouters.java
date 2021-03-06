package com.originaldreams.usermanagercenter.entity;

import java.util.Date;
import java.util.List;

public class RoleRouters {
    /**
    * 角色ID
    */
     private Integer roleId;
    /**
    * 路由ID
    */
     private Integer routerId;
    /**
    * 创建时间
    */
     private Date createTime;
     public RoleRouters(Integer roleId,Integer routerId){
         this.roleId = roleId;
         this.routerId = routerId;
         this.createTime = new Date();
     }
     public Integer getRoleId(){
           return this.roleId;
     }
     public void setRoleId(Integer roleId){
           this.roleId = roleId;
     }
     public Integer getRouterId(){
           return this.routerId;
     }
     public void setRouterId(Integer routerId){
           this.routerId = routerId;
     }
     public Date getCreateTime(){
           return this.createTime;
     }
     public void setCreateTime(Date createTime){
           this.createTime = createTime;
     }


@Override
    public String toString() {
        return "RoleRouters{" +
             "  roleId:" + roleId + "  routerId:" + routerId + "  createTime:" + createTime +
        "}";
    }
  }
