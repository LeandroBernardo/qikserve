package com.qikserve.paymentsystem.controller;

import com.qikserve.paymentsystem.dto.PromotionDTO;
import com.qikserve.paymentsystem.model.Product;
import com.qikserve.paymentsystem.service.PromotionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/promotions")
@RequiredArgsConstructor
public class PromotionController {
    private final PromotionService promotionService;

    @PostMapping("/{productId}")
    public ResponseEntity<Product> addPromotion(@PathVariable String productId, @RequestBody PromotionDTO promotionDTO) {
        return ResponseEntity.ok(promotionService.addPromotion(productId, promotionDTO));
    }
}
