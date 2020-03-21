package com.ityuan.pojo;

import com.ityuan.utils.DateUtils;
import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import java.text.ParseException;
import java.time.DateTimeException;
import java.util.Date;
/*@Getter
@Setter*/
public class Order {

    private String od_id;//订单id  主键
    private Integer od_status;//订单状态 0未支付 1已支付 2未发货 3 已发货 4 已完成
    private String od_statusStr;
    private Date od_pay_time;//订单支付时间
    private String od_pay_timeStr;
    private Integer pro_id;//商品id
    private Integer user_id;//买者用户id,下单用户
    //private String od_address;//订单收货地址
    private String od_tele;//订单收货电话
    private double od_price;//订单价格
    private String od_express_type;//订单  快递方式
    private String od_number;//订单编号
    private Date od_ship_time;//订单发货时间
    private String od_ship_timeStr;
    private  Date od_closing_time;//订单 成交时间
    private String od_closing_timeStr;
    private  Date od_creation_time;//订单创建时间
    private String od_creation_timeStr;
    private Integer od_payType;//订单支付方式  0 微信  1 支付宝
    private String od_payTypeStr;
    private int pro_num;//商品数量
    private int addr_id;//收货地址

    public Order() {
    }

    public Order(String od_id, Integer od_status, String od_statusStr, Date od_pay_time, String od_pay_timeStr, Integer pro_id, Integer user_id, String od_tele, double od_price, String od_express_type, String od_number, Date od_ship_time, String od_ship_timeStr, Date od_closing_time, String od_closing_timeStr, Date od_creation_time, String od_creation_timeStr, Integer od_payType, String od_payTypeStr, int pro_num, int addr_id) {
        this.od_id = od_id;
        this.od_status = od_status;
        this.od_statusStr = od_statusStr;
        this.od_pay_time = od_pay_time;
        this.od_pay_timeStr = od_pay_timeStr;
        this.pro_id = pro_id;
        this.user_id = user_id;
        this.od_tele = od_tele;
        this.od_price = od_price;
        this.od_express_type = od_express_type;
        this.od_number = od_number;
        this.od_ship_time = od_ship_time;
        this.od_ship_timeStr = od_ship_timeStr;
        this.od_closing_time = od_closing_time;
        this.od_closing_timeStr = od_closing_timeStr;
        this.od_creation_time = od_creation_time;
        this.od_creation_timeStr = od_creation_timeStr;
        this.od_payType = od_payType;
        this.od_payTypeStr = od_payTypeStr;
        this.pro_num = pro_num;
        this.addr_id = addr_id;
    }

    public String getOd_id() {
        return od_id;
    }

    public void setOd_id(String od_id) {
        this.od_id = od_id;
    }

    public Integer getOd_status() {
        //订单状态 0未支付 1已支付 2未发货 3 已发货 4 已完成
        if (od_statusStr=="未支付"){
            od_status=0;
        }
        if(od_statusStr=="已支付"){
            od_status=1;
        }
        if(od_statusStr=="未发货"){
            od_status=2;
        }
        if(od_statusStr=="已发货"){
            od_status=3;
        }
        if(od_statusStr=="已完成"){
            od_status=4;
        }
        return od_status;
    }

    public void setOd_status(Integer od_status) {
        this.od_status = od_status;
    }

    public String getOd_statusStr() {
        //订单状态 0未支付 1已支付 2未发货 3 已发货 4 已完成
        if (od_status==0){
            od_statusStr="未支付";
        }
        if(od_status==1){
            od_statusStr="已支付";
        }
        if(od_status==2){
            od_statusStr="未发货";
        }
        if(od_status==3){
            od_statusStr="已发货";
        }
        if(od_status==4){
            od_statusStr="已完成";
        }
        return od_statusStr;
    }

    public void setOd_statusStr(String od_statusStr) {
        this.od_statusStr = od_statusStr;
    }

    public Date getOd_pay_time() throws ParseException {
        if(od_pay_timeStr!=null){
            od_pay_time= DateUtils.string2date(od_pay_timeStr,"yyyy-MM-dd HH:mm-ss");
        }
        return od_pay_time;
    }

    public void setOd_pay_time(Date od_pay_time) {
        this.od_pay_time = od_pay_time;
    }

    public String getOd_pay_timeStr() {
        if(od_pay_time!=null){
            od_pay_timeStr= DateUtils.date2string(od_pay_time,"yyyy-MM-dd HH:mm-ss");
        }
        return od_pay_timeStr;
    }

    public void setOd_pay_timeStr(String od_pay_timeStr) {
        this.od_pay_timeStr = od_pay_timeStr;
    }

    public Integer getPro_id() {
        return pro_id;
    }

    public void setPro_id(Integer pro_id) {
        this.pro_id = pro_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getOd_tele() {
        return od_tele;
    }

    public void setOd_tele(String od_tele) {
        this.od_tele = od_tele;
    }

    public double getOd_price() {
        return od_price;
    }

    public void setOd_price(double od_price) {
        this.od_price = od_price;
    }

    public String getOd_express_type() {
        return od_express_type;
    }

    public void setOd_express_type(String od_express_type) {
        this.od_express_type = od_express_type;
    }

    public String getOd_number() {
        return od_number;
    }

    public void setOd_number(String od_number) {
        this.od_number = od_number;
    }

    public Date getOd_ship_time() throws ParseException {
        if(od_ship_timeStr!=null){
            od_ship_time= DateUtils.string2date(od_ship_timeStr,"yyyy-MM-dd HH:mm-ss");
        }
        return od_ship_time;
    }

    public void setOd_ship_time(Date od_ship_time) {
        this.od_ship_time = od_ship_time;
    }

    public String getOd_ship_timeStr() {
        if(od_ship_time!=null){
            od_ship_timeStr= DateUtils.date2string(od_ship_time,"yyyy-MM-dd HH:mm-ss");
        }
        return od_ship_timeStr;
    }

    public void setOd_ship_timeStr(String od_ship_timeStr) {
        this.od_ship_timeStr = od_ship_timeStr;
    }

    public Date getOd_closing_time() throws ParseException {
        if(od_closing_timeStr!=null){
            od_closing_time= DateUtils.string2date(od_closing_timeStr,"yyyy-MM-dd HH:mm-ss");
        }
        return od_closing_time;
    }

    public void setOd_closing_time(Date od_closing_time) {
        this.od_closing_time = od_closing_time;
    }

    public String getOd_closing_timeStr() {
        if(od_closing_time!=null){
            od_closing_timeStr= DateUtils.date2string(od_closing_time,"yyyy-MM-dd HH:mm-ss");
        }
        return od_closing_timeStr;
    }

    public void setOd_closing_timeStr(String od_closing_timeStr) {
        this.od_closing_timeStr = od_closing_timeStr;
    }

    public Date getOd_creation_time() {
        //字符串转日期
        if(od_creation_timeStr!=null){
            try {
                od_creation_time= DateUtils.string2date(od_statusStr,"yyyy-mm-dd hh:mm:ss");
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return od_creation_time;
    }

    public void setOd_creation_time(Date od_creation_time) {
        this.od_creation_time = od_creation_time;
    }

    public String getOd_creation_timeStr() {
        //日期转字符串
        if(od_creation_time!=null){
            od_creation_timeStr= DateUtils.date2string(od_creation_time,"yyyy-MM-dd HH:mm:ss");
        }
        return od_creation_timeStr;
    }

    public void setOd_creation_timeStr(String od_creation_timeStr) {
        this.od_creation_timeStr = od_creation_timeStr;
    }

    public Integer getOd_payType() {
        //订单支付方式  0 微信  1 支付宝
        if (od_payTypeStr=="微信"){
            od_payType=0;
        }
        if (od_payTypeStr=="支付宝"){
            od_payType=1;
        }
        return od_payType;
    }

    public void setOd_payType(Integer od_payType) {
        this.od_payType = od_payType;
    }

    public String getOd_payTypeStr() {
        //订单支付方式  0 微信  1 支付宝
        if (od_payType==0){
            od_payTypeStr="微信";
        }
        if (od_payType==1){
            od_payTypeStr="支付宝";
        }
        return od_payTypeStr;
    }

    public void setOd_payTypeStr(String od_payTypeStr) {
        this.od_payTypeStr = od_payTypeStr;
    }

    public int getPro_num() {
        return pro_num;
    }

    public void setPro_num(int pro_num) {
        this.pro_num = pro_num;
    }

    public int getAddr_id() {
        return addr_id;
    }

    public void setAddr_id(int addr_id) {
        this.addr_id = addr_id;
    }

    @Override
    public String toString() {
        return "Order{" +
                "od_id=" + od_id +
                ", od_status=" + od_status +
                ", od_statusStr='" + od_statusStr + '\'' +
                ", od_pay_time=" + od_pay_time +
                ", od_pay_timeStr='" + od_pay_timeStr + '\'' +
                ", pro_id=" + pro_id +
                ", user_id=" + user_id +
                ", od_tele='" + od_tele + '\'' +
                ", od_price=" + od_price +
                ", od_express_type='" + od_express_type + '\'' +
                ", od_number='" + od_number + '\'' +
                ", od_ship_time=" + od_ship_time +
                ", od_ship_timeStr='" + od_ship_timeStr + '\'' +
                ", od_closing_time=" + od_closing_time +
                ", od_closing_timeStr='" + od_closing_timeStr + '\'' +
                ", od_creation_time=" + od_creation_time +
                ", od_creation_timeStr='" + od_creation_timeStr + '\'' +
                ", od_payType=" + od_payType +
                ", od_payTypeStr='" + od_payTypeStr + '\'' +
                ", pro_num=" + pro_num +
                ", addr_id=" + addr_id +
                '}';
    }
}
