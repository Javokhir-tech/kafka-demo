package com.example.order_service.model;

import lombok.Data;

@Data
public class FoodOrder {
    String item;
    Double amount;
    Double price;
}
