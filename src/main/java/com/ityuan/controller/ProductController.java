package com.ityuan.controller;

import com.ityuan.pojo.ImagesPath;
import com.ityuan.pojo.Order;
import com.ityuan.pojo.Product;
import com.ityuan.pojo.ProductInfo;
import com.ityuan.service.ImagesPathService;
import com.ityuan.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/pro")
public class ProductController {

    @Autowired
    private ProductService productService;
    @Autowired
    private ImagesPathService imagesPathService;

    /*
    * 查询所有商品
    * */
    @RequestMapping("/details")
    @ResponseBody
    public Map<String,Object> findProductAll(){
        Map<String,Object> productInfo=new HashMap<>();
        List<ProductInfo> productInfoList=new ArrayList<>();
        List<Product> products=productService.findProductAll();

        for (int i=0;i<products.size();i++){
            ProductInfo productInfo1=new ProductInfo();
            productInfo1.setProduct(products.get(i));
            List<ImagesPath> imagesPaths=imagesPathService.selectByPid(productInfo1.getProduct().getPro_id());
            productInfo1.setImagesPath(imagesPaths);
            productInfoList.add(productInfo1);
        }
        productInfo.put("code",200);
        productInfo.put("productInfoList",productInfoList);
        productInfo.put("msg","查询成功");

        return productInfo;
    }

    /*
    * 通过商品id查询商品
    * */
    @RequestMapping("/findByProId")
    @ResponseBody
    public Map<String,Object> findByProId(int pro_id){
        Map<String,Object> productMap=new HashMap<>();
        Product product = productService.selectByProId(pro_id);
        List<ImagesPath> imagesPaths = imagesPathService.selectByPid(pro_id);
        ProductInfo productInfo=new ProductInfo();
        productInfo.setProduct(product);
        productInfo.setImagesPath(imagesPaths);
        productMap.put("code",200);
        productMap.put("msg","查询成功");
        productMap.put("productInfo",productInfo);
        return productMap;
    }

    /*
    * 通过用户描述查询商品
    * */
    @RequestMapping("/findByDescription")
    @ResponseBody
    public Map<String,Object> findByDescription(String pro_desc){
        Map<String,Object> productsMap=new HashMap<>();
        List<ProductInfo> productInfoList=new ArrayList<>();
        List<Product> products = productService.selectByDescription(pro_desc);
        for (int i=0;i<products.size();i++){
            ProductInfo productInfo=new ProductInfo();
            productInfo.setProduct(products.get(i));
            List<ImagesPath> imagesPaths = imagesPathService.selectByPid(productInfo.getProduct().getPro_id());
            productInfo.setImagesPath(imagesPaths);
            productInfoList.add(productInfo);
        }
        productsMap.put("code",200);
        productsMap.put("msg","查询成功");
        productsMap.put("productInfoList",productInfoList);
        return productsMap;
    }

    /*
    * 通过销量查询商品
    * */
    @RequestMapping("/findOrderBySolded")
    @ResponseBody
    public Map<String,Object> findOrderBySolded(){
        Map<String,Object> productInfo=new HashMap <>();
        List<ProductInfo> list=new ArrayList<>();
        List<Product> products = productService.selectOrderBySolded();
        for (int i=0;i<products.size();i++){
            ProductInfo productInfo1=new ProductInfo();
            productInfo1.setProduct(products.get(i));
            List<ImagesPath> imagesPaths = imagesPathService.selectByPid(productInfo1.getProduct().getPro_id());
            productInfo1.setImagesPath(imagesPaths);
            list.add(productInfo1);
        }
        productInfo.put("code",200);
        productInfo.put("productInfoList",list);
        productInfo.put("msg","查询成功");
        return productInfo;
    }

}
