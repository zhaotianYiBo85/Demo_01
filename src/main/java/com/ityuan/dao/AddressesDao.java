package com.ityuan.dao;

import com.ityuan.pojo.Addresses;
import com.ityuan.utils.JsonMessage;

import java.util.List;

public interface AddressesDao {
    int addAddress(Addresses addresses);

    int deleteAddress(int addr_id);

    int updateAddress(Addresses addresses);

    List<Addresses> selectAddrByUid(Integer user_id);
}
