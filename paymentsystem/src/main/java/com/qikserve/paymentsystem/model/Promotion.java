package com.qikserve.paymentsystem.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;

@Data
public class Promotion {

    @Id
    private String id;
    private String type;
    private int requiredQty;
    private int price;


}
