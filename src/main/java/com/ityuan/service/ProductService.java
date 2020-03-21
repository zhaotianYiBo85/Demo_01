package com.ityuan.service;

import com.ityuan.pojo.Product;

import java.util.List;

public interface ProductService {
    //商品详情
    public List<Product> findProductAll();

    Product selectByProId(int pro_id);

    List<Product> selectByDescription(String pro_desc);

    List<Product> selectOrderBySolded();
}
