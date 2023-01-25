package com.online.shop.service.product.controller;

import com.online.shop.service.product.domain.Product;
import com.online.shop.service.product.managment.ProductServervice;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created By ->  ismail sagir on 27.01.23
 * Project Name -> online-shop-service
 */
@RestController
@RequestMapping("api/product/v1")
public class ProductController {

    private final ProductServervice productServervice;

    public ProductController( ProductServervice productServervice) {
        this.productServervice = productServervice;

    }

    @GetMapping("/get/product")
    public ResponseEntity<List<Product>> getAll(){
        return ResponseEntity.ok(productServervice.getProduct());
    }


    @PostMapping("/add/product")
    public ResponseEntity<String> addProduct(@RequestBody Product product){
        productServervice.add(product);
        return ResponseEntity.ok("Product Added");
    }

    @GetMapping("/string")

    public ResponseEntity<String> get(){
        return ResponseEntity.ok("working!");
    }
}
