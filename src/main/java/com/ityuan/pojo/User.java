package com.ityuan.pojo;

public class User {
    private Integer user_id;
    private String user_nickName;
    private String user_name;
    private String user_sefinftro;
    private String user_birth;
    private String user_idcard;
    private String user_photo;
    private String user_bgImage;
    private String user_telephone;
    private String user_location;
    private String user_sex;
    private String user_password;
    private String user_loginId;
    private String user_reDate;
    private String user_login_time;
    private String user_last_loginDate;
    private Integer WI_id;

    private String token;//token

    public User() {
    }

    public User(Integer user_id, String user_nickName, String user_name, String user_sefinftro, String user_birth, String user_idcard, String user_photo, String user_bgImage, String user_telephone, String user_location, String user_sex, String user_password, String user_loginId, String user_reDate, String user_login_time, String user_last_loginDate, Integer WI_id, String token) {
        this.user_id = user_id;
        this.user_nickName = user_nickName;
        this.user_name = user_name;
        this.user_sefinftro = user_sefinftro;
        this.user_birth = user_birth;
        this.user_idcard = user_idcard;
        this.user_photo = user_photo;
        this.user_bgImage = user_bgImage;
        this.user_telephone = user_telephone;
        this.user_location = user_location;
        this.user_sex = user_sex;
        this.user_password = user_password;
        this.user_loginId = user_loginId;
        this.user_reDate = user_reDate;
        this.user_login_time = user_login_time;
        this.user_last_loginDate = user_last_loginDate;
        this.WI_id = WI_id;
        this.token = token;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_nickName() {
        return user_nickName;
    }

    public void setUser_nickName(String user_nickName) {
        this.user_nickName = user_nickName;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_sefinftro() {
        return user_sefinftro;
    }

    public void setUser_sefinftro(String user_sefinftro) {
        this.user_sefinftro = user_sefinftro;
    }

    public String getUser_birth() {
        return user_birth;
    }

    public void setUser_birth(String user_birth) {
        this.user_birth = user_birth;
    }

    public String getUser_idcard() {
        return user_idcard;
    }

    public void setUser_idcard(String user_idcard) {
        this.user_idcard = user_idcard;
    }

    public String getUser_photo() {
        return user_photo;
    }

    public void setUser_photo(String user_photo) {
        this.user_photo = user_photo;
    }

    public String getUser_bgImage() {
        return user_bgImage;
    }

    public void setUser_bgImage(String user_bgImage) {
        this.user_bgImage = user_bgImage;
    }

    public String getUser_telephone() {
        return user_telephone;
    }

    public void setUser_telephone(String user_telephone) {
        this.user_telephone = user_telephone;
    }

    public String getUser_location() {
        return user_location;
    }

    public void setUser_location(String user_location) {
        this.user_location = user_location;
    }

    public String getUser_sex() {
        return user_sex;
    }

    public void setUser_sex(String user_sex) {
        this.user_sex = user_sex;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_loginId() {
        return user_loginId;
    }

    public void setUser_loginId(String user_loginId) {
        this.user_loginId = user_loginId;
    }

    public String getUser_reDate() {
        return user_reDate;
    }

    public void setUser_reDate(String user_reDate) {
        this.user_reDate = user_reDate;
    }

    public String getUser_login_time() {
        return user_login_time;
    }

    public void setUser_login_time(String user_login_time) {
        this.user_login_time = user_login_time;
    }

    public String getUser_last_loginDate() {
        return user_last_loginDate;
    }

    public void setUser_last_loginDate(String user_last_loginDate) {
        this.user_last_loginDate = user_last_loginDate;
    }

    public Integer getWI_id() {
        return WI_id;
    }

    public void setWI_id(Integer WI_id) {
        this.WI_id = WI_id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", user_nickName='" + user_nickName + '\'' +
                ", user_name='" + user_name + '\'' +
                ", user_sefinftro='" + user_sefinftro + '\'' +
                ", user_birth='" + user_birth + '\'' +
                ", user_idcard='" + user_idcard + '\'' +
                ", user_photo='" + user_photo + '\'' +
                ", user_bgImage='" + user_bgImage + '\'' +
                ", user_telephone='" + user_telephone + '\'' +
                ", user_location='" + user_location + '\'' +
                ", user_sex='" + user_sex + '\'' +
                ", user_password='" + user_password + '\'' +
                ", user_loginId='" + user_loginId + '\'' +
                ", user_reDate='" + user_reDate + '\'' +
                ", user_login_time='" + user_login_time + '\'' +
                ", user_last_loginDate='" + user_last_loginDate + '\'' +
                ", WI_id=" + WI_id +
                ", token='" + token + '\'' +
                '}';
    }



}
