package com.online.shop.service.product.repository;

import com.online.shop.service.product.domain.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.List;

/**
 * Created By ->  ismail sagir on 27.01.23
 * Project Name -> online-shop-service
 */
@EnableMongoRepositories
public interface ProductDao extends MongoRepository<Product,Long> {



}
