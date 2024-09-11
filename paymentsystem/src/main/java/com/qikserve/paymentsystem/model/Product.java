package com.qikserve.paymentsystem.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@Document(collection= "products")
public class Product {

    @Id
    private String id;
    private String name;
    private int price;

    private List<Promotion> promotions = new ArrayList<>();

}
