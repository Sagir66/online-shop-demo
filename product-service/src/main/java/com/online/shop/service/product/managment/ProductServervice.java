package com.online.shop.service.product.managment;

import com.online.shop.service.product.domain.Product;

import java.util.List;

public interface ProductServervice {

    List<Product> getProduct();
    void add(Product product);
}
