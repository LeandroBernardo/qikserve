package com.qikserve.paymentsystem.util;

import com.qikserve.paymentsystem.dto.ProductDTO;
import com.qikserve.paymentsystem.model.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductConverter {

    public ProductDTO convertToDTO(Product product) {
        ProductDTO dto = new ProductDTO();
        dto.setId(product.getId());
        dto.setName(product.getName());
        dto.setPrice(product.getPrice());
        return dto;
    }
}
