package com.ityuan.pojo;

import java.util.List;

public class ProductInfo {
    private Product product;
    private List<ImagesPath> imagesPath;

    public ProductInfo(Product product, List<ImagesPath> imagesPath) {
        this.product = product;
        this.imagesPath = imagesPath;
    }

    public ProductInfo() {
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public List<ImagesPath> getImagesPath() {
        return imagesPath;
    }

    public void setImagesPath(List<ImagesPath> imagesPath) {
        this.imagesPath = imagesPath;
    }

    @Override
    public String toString() {
        return "ProductInfo{" +
                "product=" + product +
                ", imagesPath=" + imagesPath +
                '}';
    }
}
