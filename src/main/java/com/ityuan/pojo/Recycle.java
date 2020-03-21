package com.ityuan.pojo;

public class Recycle {

    private Integer id;//回收id 主键
    private Integer user_id;//用户id ，外键
    private String location;//下单回收地址
    private String largeLeiBie;//回收垃圾的类型
    private String kilograms;//回收垃圾的重量
    private String telephone;//下单回收的电话号码
    private Integer order_status;//预约回收的状态  0已下单 1已接单 2已完成
    private String order_statusStr;

    public Recycle() {
    }

    public Recycle(Integer id, Integer user_id, String location, String largeLeiBie, String kilograms, String telephone, Integer order_status, String order_statusStr) {
        this.id = id;
        this.user_id = user_id;
        this.location = location;
        this.largeLeiBie = largeLeiBie;
        this.kilograms = kilograms;
        this.telephone = telephone;
        this.order_status = order_status;
        this.order_statusStr = order_statusStr;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLargeLeiBie() {
        return largeLeiBie;
    }

    public void setLargeLeiBie(String largeLeiBie) {
        this.largeLeiBie = largeLeiBie;
    }

    public String getKilograms() {
        return kilograms;
    }

    public void setKilograms(String kilograms) {
        this.kilograms = kilograms;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Integer getOrder_status() {
        return order_status;
    }

    public void setOrder_status(Integer order_status) {
        this.order_status = order_status;
    }

    public String getOrder_statusStr() {
        //预约回收的状态  0已下单 1已接单 2已完成
        if (order_status==0){
            order_statusStr="已下单";
        }
        if (order_status==1){
            order_statusStr="已接单";
        }
        if (order_status==2){
            order_statusStr="已完成";
        }
        return order_statusStr;
    }

    public void setOrder_statusStr(String order_statusStr) {
        this.order_statusStr = order_statusStr;
    }

    @Override
    public String toString() {
        return "Recycle{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", location='" + location + '\'' +
                ", largeLeiBie='" + largeLeiBie + '\'' +
                ", kilograms='" + kilograms + '\'' +
                ", telephone='" + telephone + '\'' +
                ", order_status=" + order_status +
                ", order_statusStr='" + order_statusStr + '\'' +
                '}';
    }
}
