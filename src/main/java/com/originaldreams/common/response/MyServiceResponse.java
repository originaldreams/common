package com.originaldreams.common.response;

/**
 * 规定Service统一的消息返回格式
 * 在Controller中统一返回ResponseEntity格式的数据，在ResponseEntity的body里，必须使用MyResponseObject格式的数据
 */
public class MyServiceResponse {
    private Object data ;
    private String message ;

    public MyServiceResponse(Object data) {
        this.data = data;
    }

    public MyServiceResponse(Object data,String message){
        this.data = data;
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
