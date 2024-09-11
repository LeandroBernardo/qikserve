package com.qikserve.paymentsystem.repository;

import com.qikserve.paymentsystem.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
