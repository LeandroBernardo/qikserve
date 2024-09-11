package com.qikserve.paymentsystem.controller;

import com.qikserve.paymentsystem.dto.ProductDTO;
import com.qikserve.paymentsystem.model.Product;
import com.qikserve.paymentsystem.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody ProductDTO productDTO) {
        return ResponseEntity.ok(productService.createProduct(productDTO));
    }

    @PostMapping("/multiples")
    public ResponseEntity<List<Product>> createMultipleProducts(@RequestBody List<ProductDTO> productDTOs) {
        List<Product> products = productService.createMultipleProducts(productDTOs);
        return new ResponseEntity<>(products, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts() {
        return ResponseEntity.ok(productService.getAllProducts());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable String id) {
        return ResponseEntity.ok(productService.getProductById(id));
    }
}
