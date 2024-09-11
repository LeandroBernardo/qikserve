package com.qikserve.paymentsystem.dto;

import lombok.Data;

@Data
public class PromotionDTO {
    private String type;
    private int requiredQty;
    private int price;
}