package com.example.product.repository;

import com.example.product.document.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProductRepository extends MongoRepository<Product,Integer> {
    List<Product> findAll();
    Product findById(String id);
    Product save(Product product);
    Product findByProductId(String productId);
}
