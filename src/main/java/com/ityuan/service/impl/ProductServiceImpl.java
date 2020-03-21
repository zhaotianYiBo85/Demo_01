package com.ityuan.service.impl;

import com.ityuan.dao.ProductDao;
import com.ityuan.pojo.Product;
import com.ityuan.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("productService")
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;
    @Override
    public List<Product> findProductAll() {
        return productDao.findProductAll();
    }

    @Override
    public Product selectByProId(int pro_id) {
        return productDao.selectByProId(pro_id);
    }

    @Override
    public List<Product> selectByDescription(String pro_desc) {
        return productDao.selectByDescription(pro_desc);
    }

    @Override
    public List<Product> selectOrderBySolded() {
        return productDao.selectOrderBySolded();
    }
}
