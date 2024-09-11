package com.qikserve.paymentsystem.service;

import com.qikserve.paymentsystem.dto.ProductDTO;
import com.qikserve.paymentsystem.model.Product;
import com.qikserve.paymentsystem.repository.ProductRepository;
import com.qikserve.paymentsystem.util.ProductConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductConverter productConverter;

    public Product createProduct(ProductDTO productDTO) {
        Product product = new Product();

        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice());
        return productRepository.save(product);
    }

    public List<Product> createMultipleProducts(List<ProductDTO> productDTOs) {

        List<Product> products = productDTOs.stream().map(dto -> {
            Product product = new Product();
            product.setName(dto.getName());
            product.setPrice(dto.getPrice());
            return product;
        }).collect(Collectors.toList());

        return productRepository.saveAll(products);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public List<ProductDTO> getAllProductsWithoutPromotions() {
        List<Product> products = productRepository.findAll();
        return products.stream()
                .map(productConverter::convertToDTO)
                .collect(Collectors.toList());
    }

    public Product getProductById(String id) {
        return productRepository.findById(id).orElse(null);
    }
}
