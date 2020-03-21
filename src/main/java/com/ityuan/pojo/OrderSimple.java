package com.ityuan.pojo;

public class OrderSimple {
    private int pro_id;//订单商品id
    private int od_num;//订单数量

    public OrderSimple() {
    }

    public OrderSimple(int pro_id, int od_num) {
        this.pro_id = pro_id;
        this.od_num = od_num;
    }

    public int getPro_id() {
        return pro_id;
    }

    public void setPro_id(int pro_id) {
        this.pro_id = pro_id;
    }

    public int getOd_num() {
        return od_num;
    }

    public void setOd_num(int od_num) {
        this.od_num = od_num;
    }

    @Override
    public String toString() {
        return "OrderSimple{" +
                "pro_id=" + pro_id +
                ", od_num=" + od_num +
                '}';
    }
}
