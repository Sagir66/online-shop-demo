package com.online.shop.service.product.managment;

import com.online.shop.service.product.domain.Product;
import com.online.shop.service.product.repository.ProductDao;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created By ->  ismail sagir on 27.01.23
 * Project Name -> online-shop-service
 */
@Service
public class ProductManager implements ProductServervice {
    private final ProductDao productDao;
    private static Logger log;

    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public List<Product> getProduct() {
        return productDao.findAll();
    }

    @Override
    public void add(Product product) {
     productDao.save(product);
    }
}
