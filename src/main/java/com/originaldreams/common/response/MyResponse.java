package com.originaldreams.common.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

/**
 * 规定Controller统一的消息返回格式
 */
public class MyResponse {
    /**
     * 返回OK
     * @param object
     * @return
     */
    public static ResponseEntity ok(MyServiceResponse object){
        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(object);
    }

    /**
     * 异常请求
     * @return
     */
    public static ResponseEntity badRequest(){
        MyServiceResponse response = new MyServiceResponse(MyServiceResponse.success_code_failed,"请求参数异常");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).contentType(MediaType.APPLICATION_JSON).body(response);
    }

    /**
     * 没有登录
     * @return
     */
    public static  ResponseEntity unauthorized(){
        MyServiceResponse response = new MyServiceResponse(MyServiceResponse.success_code_failed,"用户未登录");
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).contentType(MediaType.APPLICATION_JSON).body(response);
    }

    /**
     * 没有访问权限
     * @return
     */
    public static  ResponseEntity forbidden(){
        MyServiceResponse response = new MyServiceResponse(MyServiceResponse.success_code_failed,"没有权限");
        return ResponseEntity.status(HttpStatus.FORBIDDEN).contentType(MediaType.APPLICATION_JSON).body(response);
    }
}
