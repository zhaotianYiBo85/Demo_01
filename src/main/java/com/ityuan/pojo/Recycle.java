package com.ityuan.pojo;

import com.ityuan.utils.DateUtils;

import java.text.ParseException;
import java.util.Date;

public class Recycle {

    private Integer id;//回收id 主键
    private String location;//下单回收地址
    private String largeLeiBie;//回收垃圾的类型
    private String kilograms;//回收垃圾的重量
    private String telephone;//下单回收的电话号码
    private Integer order_status;//预约回收的状态  0已下单 1已接单 2已完成
    private String order_statusStr;
    private Integer user_id;//用户id ，外键
    private Date gotime;//上门回收垃圾时间
    private String gotimeStr;
    private String person;//预约回收人姓名
    private Date ordertime;//下单时间
    private String ordertimeStr;

    public Recycle() {
    }

    public Recycle(Integer id, Integer user_id, String location, String largeLeiBie, String kilograms, String telephone, Integer order_status, String order_statusStr, Integer user_id1, Date gotime, String gotimeStr, String person, Date ordertime, String ordertimeStr) {
        this.id = id;
        this.user_id = user_id;
        this.location = location;
        this.largeLeiBie = largeLeiBie;
        this.kilograms = kilograms;
        this.telephone = telephone;
        this.order_status = order_status;
        this.order_statusStr = order_statusStr;
        this.user_id = user_id1;
        this.gotime = gotime;
        this.gotimeStr = gotimeStr;
        this.person = person;
        this.ordertime = ordertime;
        this.ordertimeStr = ordertimeStr;
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
        //预约回收的状态  0已下单 1已接单 2已完成
        if (order_statusStr=="已下单"){
            order_status=0;
        }
        if (order_statusStr=="已接单"){
            order_status=1;
        }
        if (order_statusStr=="已完成"){
            order_status=2;
        }
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


    public Date getGotime() throws ParseException {
        if(gotimeStr!=null){
            gotime= DateUtils.string2date(gotimeStr,"yyyy-MM-dd HH:mm-ss");
        }
        return gotime;
    }

    public void setGotime(Date gotime) {
        this.gotime = gotime;
    }

    public String getGotimeStr() {
        if(gotime!=null){
            gotimeStr= DateUtils.date2string(gotime,"yyyy-MM-dd HH:mm-ss");
        }
        return gotimeStr;
    }

    public void setGotimeStr(String gotimeStr) {
        this.gotimeStr = gotimeStr;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public Date getOrdertime() throws ParseException {
        if(ordertimeStr!=null){
            ordertime= DateUtils.string2date(ordertimeStr,"yyyy-MM-dd HH:mm-ss");
        }
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public String getOrdertimeStr() {
        if(ordertime!=null){
            ordertimeStr= DateUtils.date2string(ordertime,"yyyy-MM-dd HH:mm-ss");
        }
        return ordertimeStr;
    }

    public void setOrdertimeStr(String ordertimeStr) {
        this.ordertimeStr = ordertimeStr;
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
                ", gotime=" + gotime +
                ", gotimeStr='" + gotimeStr + '\'' +
                ", person='" + person + '\'' +
                ", ordertime=" + ordertime +
                ", ordertimeStr='" + ordertimeStr + '\'' +
                '}';
    }
}
