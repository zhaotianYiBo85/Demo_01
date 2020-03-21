package com.ityuan.pojo;

import com.ityuan.utils.DateUtils;

import java.util.Date;

public class Evaluate {
    private Integer eva_id;//评价id 主键
    private Integer user_id;//评价用户的id
    private Integer pro_id;//被评价商品id
    private Date eva_time;//评价的日期
    private String eva_timeStr;
    private String eva_context;//评价内容
    private String eva_star;//评价的星级

    public Evaluate() {
    }

    public Evaluate(Integer eva_id, Integer user_id, Integer pro_id, Date eva_time, String eva_timeStr, String eva_context, String eva_star) {
        this.eva_id = eva_id;
        this.user_id = user_id;
        this.pro_id = pro_id;
        this.eva_time = eva_time;
        this.eva_timeStr = eva_timeStr;
        this.eva_context = eva_context;
        this.eva_star = eva_star;
    }

    public Integer getEva_id() {
        return eva_id;
    }

    public void setEva_id(Integer eva_id) {
        this.eva_id = eva_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getPro_id() {
        return pro_id;
    }

    public void setPro_id(Integer pro_id) {
        this.pro_id = pro_id;
    }

    public Date getEva_time() {
        return eva_time;
    }

    public void setEva_time(Date eva_time) {
        this.eva_time = eva_time;
    }

    public String getEva_timeStr() {
        if(eva_time!=null){
            eva_timeStr= DateUtils.date2string(eva_time,"yyyy-MM-dd HH:mm-ss");
        }
        return eva_timeStr;
    }

    public void setEva_timeStr(String eva_timeStr) {
        this.eva_timeStr = eva_timeStr;
    }

    public String getEva_context() {
        return eva_context;
    }

    public void setEva_context(String eva_context) {
        this.eva_context = eva_context;
    }

    public String getEva_star() {
        return eva_star;
    }

    public void setEva_star(String eva_star) {
        this.eva_star = eva_star;
    }

    @Override
    public String toString() {
        return "Evaluate{" +
                "eva_id=" + eva_id +
                ", user_id=" + user_id +
                ", pro_id=" + pro_id +
                ", eva_time=" + eva_time +
                ", eva_timeStr='" + eva_timeStr + '\'' +
                ", eva_context='" + eva_context + '\'' +
                ", eva_star='" + eva_star + '\'' +
                '}';
    }
}
