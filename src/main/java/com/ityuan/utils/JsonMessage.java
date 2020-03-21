package com.ityuan.utils;

import java.sql.Array;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JsonMessage {
    private int code;//状态码
    private String msg;//响应信息
    private Map<String,Object> info= new HashMap<>();//返回内容
    //处理成功响应
    public static JsonMessage success(){
        return new JsonMessage(100,"处理成功");
    }
    //处理失败响应
    public static JsonMessage fail(){
        return new JsonMessage(200,"处理失败");
    }
    //错误响应
    public static JsonMessage error(String msg){
        return new JsonMessage(200,msg);
    }
    //异常响应
    public static JsonMessage exception(){
        return new JsonMessage(300,"处理异常！");
    }
    //封装返回响应信息
    public JsonMessage add(String key, Object o){
        this.info.put(key,o);
        return this;
    }

    public JsonMessage addArray(String key, List array){
        this.info.put(key,array);
        return this;
    }

    public JsonMessage(int code, String msg, Map<String, Object> info) {
        this.code = code;
        this.msg = msg;
        this.info = info;
    }

    public JsonMessage(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public JsonMessage() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Map<String, Object> getInfo() {
        return info;
    }

    public void setInfo(Map<String, Object> info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "JsonMessage{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", info=" + info +
                '}';
    }
}
