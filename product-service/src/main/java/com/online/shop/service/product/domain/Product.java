package com.online.shop.service.product.domain;

import lombok.Data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created By ->  ismail sagir on 27.01.23
 * Project Name -> online-shop-service
 */
@Document("product")
@Data
public class Product {

    @Id

    private int id;
    private  String product_Name;
    private Long inStock;

    public Product() {
    }

    public Product(int id, String product_Name, Long inStock) {
        this.id = id;
        this.product_Name = product_Name;
        this.inStock = inStock;
    }



    @Override
    public String toString() {

        return "Product{" +
                "id=" + id +
                ", product_Name='" + product_Name + '\'' +
                ", inStock=" + inStock +
                '}';
    }
}
