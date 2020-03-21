package com.ityuan.dao;

import com.ityuan.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
    public User login(User user);
    public String register();

    User selectUserByToken(String token);
    public User selectUserByPhone(@Param("user_telephone") String user_telephone);

    int updateByPrimaryKey(User user);
    public int insertUser(User user);
    /**
     * 通过手机号码和密码查询用户
     * @return
     */
    public User selectUserByTelephoneAndPassword(@Param("usertelephone") String user_telephone, @Param("userpassword") String user_password);
}
