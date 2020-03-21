package com.ityuan.service.impl;

import com.ityuan.dao.AddressesDao;
import com.ityuan.dao.UserDao;
import com.ityuan.pojo.Addresses;
import com.ityuan.pojo.User;
import com.ityuan.service.AddressesService;
import com.ityuan.service.UserService;
import com.ityuan.utils.JsonMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("addressesService")
public class AddressesServiceImpl implements AddressesService {

    @Autowired
    private AddressesDao addressesDao;
    @Autowired
    private UserDao userDao;

    @Override
    public JsonMessage addAddress(Addresses addresses, String token) {
        User user = userDao.selectUserByToken(token);
        addresses.setUser_id(user.getUser_id());
        System.out.println(addresses);
        addressesDao.addAddress(addresses);
        return JsonMessage.success().add("msg", "创建成功");
    }

    @Override
    public JsonMessage deleteAddress(int addr_id, String token) {
        addressesDao.deleteAddress(addr_id);
        int cons = addressesDao.deleteAddress(addr_id);
        if (cons>0){
            return JsonMessage.success().add("msg","删除成功");
        }else {
            return JsonMessage.fail().add("msg","删除失败");
        }

    }

    @Override
    public JsonMessage updateAddress(Addresses addresses, String token) {
        User user = userDao.selectUserByToken(token);
        addresses.setUser_id(user.getUser_id());
        System.out.println("更改前"+addresses);
        int cons=addressesDao.updateAddress(addresses);
        if(cons>0){
            return JsonMessage.success().add("msg", "修改成功");
        }else {
            return JsonMessage.fail().add("msg", "修改失败");
        }

    }

    @Override
    public JsonMessage selectAddrByUid(Integer user_id) {

        List<Addresses> addresses = addressesDao.selectAddrByUid(user_id);
        return JsonMessage.success().add("addresses",addresses);
    }
}
