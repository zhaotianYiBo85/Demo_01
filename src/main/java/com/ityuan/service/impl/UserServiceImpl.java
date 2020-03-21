package com.ityuan.service.impl;

import com.ityuan.dao.UserDao;
import com.ityuan.pojo.User;
import com.ityuan.service.UserService;
import com.ityuan.utils.JsonMessage;
import com.ityuan.utils.OtherStatus;
import com.ityuan.utils.TokenProccessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public JsonMessage login(String user_telephone, String user_password) {
        System.out.println(user_telephone+"    "+user_password);
        User user = userDao.selectUserByTelephoneAndPassword(user_telephone, user_password);
        System.out.println(user.getUser_telephone());
        if (user == null) {
            return new JsonMessage(200, "登录失败，请核账号信息！");
        }
        //获取到token
        String tokenPattern = TokenProccessor.GetTokenPattern();
        //对用户对象设置
        user.setToken(tokenPattern);
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = sdf.format(d);
        user.setUser_last_loginDate(s);
        System.out.println(user);
        //将对象保存到数据库
        userDao.updateByPrimaryKey(user);
        return JsonMessage.success().add("token", tokenPattern);
    }

    @Override
    public JsonMessage register(String user_telephone, String user_password) {

        //判断输入格式是否正确

        //判断用户是否存在
        if (userDao.selectUserByPhone(user_telephone) != null) {
            return new JsonMessage(200, "该用户已经存在！");
        }
        //对密码进行加密

        //创建注册对象
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = sdf.format(d);
        User user=new User(1, null, null, null, null, null,null,null, user_telephone, null, null, user_password,null,s,s,s,null,OtherStatus.logouttoken);
        //将新用户添加进数据库
        userDao.insertUser(user);

        return JsonMessage.success().add("phone",user_telephone);
    }

    @Override
    public User selectUserByToken(String token) {
        return userDao.selectUserByToken(token);
    }

    @Override
    public int updateByPrimaryKey(User user) {
        return userDao.updateByPrimaryKey(user);
    }
}




