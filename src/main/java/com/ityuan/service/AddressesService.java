package com.ityuan.service;

import com.ityuan.pojo.Addresses;
import com.ityuan.utils.JsonMessage;

public interface AddressesService {
    /*
    * 新增地址
    * */
    JsonMessage addAddress(Addresses addresses, String token);

    /*
    * 根据地址id，删除地址
    * */
    JsonMessage deleteAddress(int addr_id, String token);

    /*
    * 更新地址*/
    JsonMessage updateAddress(Addresses addresses, String token);

    /*
    * 根据用户id查询地址
    * */
    JsonMessage selectAddrByUid(Integer user_id);
}
