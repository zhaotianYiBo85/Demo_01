package com.ityuan.dao;

import com.ityuan.pojo.Order;

import java.util.List;

public interface OrderDao {
    public List<Order> findOrder(Order order);

    List<Order> findOrderByUId(int user_id);

    int insertOrder(Order order, String token);

    List<Order> selectByOid(String od_id);
}
