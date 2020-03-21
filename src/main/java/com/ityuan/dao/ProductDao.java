package com.ityuan.dao;

import com.ityuan.pojo.Product;

import java.util.List;

public interface ProductDao {

    public List<Product> findProductAll();

    Product selectByProId(int pro_id);

    List<Product> selectByDescription(String pro_desc);

    List<Product> selectOrderBySolded();
}
