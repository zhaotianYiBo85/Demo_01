package com.ityuan.service.impl;

import com.ityuan.dao.OrderDao;
import com.ityuan.pojo.Order;
import com.ityuan.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("orderService")
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;

    @Override
    public List<Order> findOrder(Order order) {
        return orderDao.findOrder(order);
    }

    @Override
    public List<Order> findOrderByUId(int user_id) {
        return orderDao.findOrderByUId(user_id);
    }

    @Override
    public int insertOrder(Order order, String token) {
        return orderDao.insertOrder(order, token);
    }

    @Override
    public List<Order> selectByOid(String od_id) {
        return orderDao.selectByOid(od_id);
    }
}
