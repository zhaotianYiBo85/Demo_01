package com.ityuan.service;

import com.ityuan.pojo.Evaluate;
import com.ityuan.pojo.Order;
import com.ityuan.pojo.Product;
import com.ityuan.pojo.User;
import com.ityuan.utils.JsonMessage;

import java.util.List;

public interface UserService {
    public JsonMessage login(String phone,String password);
    public JsonMessage register(String user_telephone, String user_password);


    /*
    * 通过token查询用户信息
    * */
    User selectUserByToken(String token);

    /*
    * 根据主键修改用于信息
    * */
    int updateByPrimaryKey(User user);
}
