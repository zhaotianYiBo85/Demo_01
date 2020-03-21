package com.ityuan.pojo;

public class Addresses {
    private int addr_id;//地址id
    private String recever;//收货人
    private String phone;//收货人电话
    private String address;//收货地址
    private Integer user_id;//用户id

    public Addresses(int addr_id, String recever, String phone, String address, Integer user_id) {
        this.addr_id = addr_id;
        this.recever = recever;
        this.phone = phone;
        this.address = address;
        this.user_id = user_id;
    }

    public Addresses() {
    }

    public int getAddr_id() {
        return addr_id;
    }

    public void setAddr_id(int addr_id) {
        this.addr_id = addr_id;
    }

    public String getRecever() {
        return recever;
    }

    public void setRecever(String recever) {
        this.recever = recever;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "Addresses{" +
                "addr_id=" + addr_id +
                ", recever='" + recever + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", user_id=" + user_id +
                '}';
    }
}
