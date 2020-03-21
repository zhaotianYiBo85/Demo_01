package com.ityuan.pojo;

import com.ityuan.utils.DateUtils;

import java.text.ParseException;
import java.util.Date;

public class Product {
    private Integer pro_id; //商品id 主键
    private String pro_name;//商品名称
    private double pro_price;//商品价格
    private String pro_photo;//商品图片
    private String pro_brand;//商品品牌
    private  String pro_type;//商品类型
    private String pro_color;//商品颜色
    private Date pro_date;//商品保修期
    private String pro_dateStr;
    private String pro_desc;//商品描述
    private String pro_number;//商品编号
    private Integer pro_status;//商品状态  0 关闭  1开启
    private String pro_statusStr;
    private int pro_totNumber;//商品库存总量
    private int pro_solded;//商品已售数量

    public Product() {
    }

    public Product(Integer pro_id, String pro_name, double pro_price, String pro_photo, String pro_brand, String pro_type, String pro_color, Date pro_date, String pro_dateStr, String pro_desc, String pro_number, Integer pro_status, String pro_statusStr, int number, int solded) {
        this.pro_id = pro_id;
        this.pro_name = pro_name;
        this.pro_price = pro_price;
        this.pro_photo = pro_photo;
        this.pro_brand = pro_brand;
        this.pro_type = pro_type;
        this.pro_color = pro_color;
        this.pro_date = pro_date;
        this.pro_dateStr = pro_dateStr;
        this.pro_desc = pro_desc;
        this.pro_number = pro_number;
        this.pro_status = pro_status;
        this.pro_statusStr = pro_statusStr;
        this.pro_totNumber = pro_totNumber;
        this.pro_solded = pro_solded;
    }

    public String getPro_desc() {
        return pro_desc;
    }

    public void setPro_desc(String pro_desc) {
        this.pro_desc = pro_desc;
    }

    public String getPro_number() {
        return pro_number;
    }

    public void setPro_number(String pro_number) {
        this.pro_number = pro_number;
    }

    public String getPro_statusStr() {
        if (pro_status!=null){
            //商品状态  0 关闭  1开启
            if(pro_status==0){
                pro_statusStr="关闭";
            }
            if (pro_status==1){
                pro_statusStr="开启";
            }
        }
        return pro_statusStr;
    }

    public void setPro_statusStr(String pro_statusStr) {
        this.pro_statusStr = pro_statusStr;
    }

    public Integer getPro_status() {
        if (pro_status!=null){
            //商品状态  0 关闭  1开启
            if(pro_statusStr=="关闭"){
                pro_status=0;
            }
            if (pro_statusStr=="开启"){
                pro_status=1;
            }
        }
        return pro_status;
    }

    public void setPro_status(Integer pro_status) {
        this.pro_status = pro_status;
    }

    public Date getPro_date() throws ParseException {
        //将String型的时间转换为Date
        if(pro_date!=null){
            pro_date= DateUtils.string2date(pro_dateStr,"yyyy-MM-dd HH:mm-ss");
        }
        return pro_date;
    }

    public void setPro_date(Date pro_date) {
        this.pro_date = pro_date;
    }

    public String getPro_dateStr() {
        //将Date型的时间转换为String
        if(pro_date!=null){
            pro_dateStr= DateUtils.date2string(pro_date,"yyyy-MM-dd HH:mm-ss");
        }
        return pro_dateStr;
    }

    public void setPro_dateStr(String pro_dateStr) {
        this.pro_dateStr = pro_dateStr;
    }

    public Integer getPro_id() {
        return pro_id;
    }

    public void setPro_id(Integer pro_id) {
        this.pro_id = pro_id;
    }

    public String getPro_name() {
        return pro_name;
    }

    public void setPro_name(String pro_name) {
        this.pro_name = pro_name;
    }

    public double getPro_price() {
        return pro_price;
    }

    public void setPro_price(double pro_price) {
        this.pro_price = pro_price;
    }

    public String getPro_brand() {
        return pro_brand;
    }

    public void setPro_brand(String pro_brand) {
        this.pro_brand = pro_brand;
    }

    public String getPro_type() {
        return pro_type;
    }

    public void setPro_type(String pro_type) {
        this.pro_type = pro_type;
    }

    public String getPro_color() {
        return pro_color;
    }

    public void setPro_color(String pro_color) {
        this.pro_color = pro_color;
    }

    public String getPro_photo() {
        return pro_photo;
    }

    public void setPro_photo(String pro_photo) {
        this.pro_photo = pro_photo;
    }

    public int getPro_totNumber() {
        return pro_totNumber;
    }

    public void setPro_totNumber(int pro_totNumber) {
        this.pro_totNumber = pro_totNumber;
    }

    public int getPro_solded() {
        return pro_solded;
    }

    public void setPro_solded(int pro_solded) {
        this.pro_solded = pro_solded;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pro_id=" + pro_id +
                ", pro_name='" + pro_name + '\'' +
                ", pro_price=" + pro_price +
                ", pro_photo='" + pro_photo + '\'' +
                ", pro_brand='" + pro_brand + '\'' +
                ", pro_type='" + pro_type + '\'' +
                ", pro_color='" + pro_color + '\'' +
                ", pro_date=" + pro_date +
                ", pro_dateStr='" + pro_dateStr + '\'' +
                ", pro_desc='" + pro_desc + '\'' +
                ", pro_number='" + pro_number + '\'' +
                ", pro_status=" + pro_status +
                ", pro_statusStr='" + pro_statusStr + '\'' +
                ", pro_totNumber=" + pro_totNumber +
                ", pro_solded=" + pro_solded +
                '}';
    }
}
