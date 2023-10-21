package com.example.food_storage.model;

import lombok.Data;
import lombok.Value;

@Data
@Value
public class FoodStorage {
    String item;
    Double amount;
}
