package com.qikserve.paymentsystem.service;

import com.qikserve.paymentsystem.dto.PromotionDTO;
import com.qikserve.paymentsystem.exception.ProductNotFoundException;
import com.qikserve.paymentsystem.model.Product;
import com.qikserve.paymentsystem.model.Promotion;
import com.qikserve.paymentsystem.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class PromotionService {

    @Autowired
    private ProductRepository productRepository;

    public Product addPromotion(String productId, PromotionDTO promotionDTO) {
        Product product = productRepository.findById(productId).orElseThrow(() -> new ProductNotFoundException("Product not found"));

        Promotion promotion = new Promotion();
        promotion.setId(UUID.randomUUID().toString());
        promotion.setType(promotionDTO.getType());
        promotion.setRequiredQty(promotionDTO.getRequiredQty());
        promotion.setPrice(promotionDTO.getPrice());

        product.getPromotions().add(promotion);

        return productRepository.save(product);
    }
}
