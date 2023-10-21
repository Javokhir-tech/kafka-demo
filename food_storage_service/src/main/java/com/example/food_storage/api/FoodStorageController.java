package com.example.food_storage.api;

import com.example.food_storage.model.FoodStorage;
import com.example.food_storage.service.FoodStorageService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/storage")
@RequiredArgsConstructor
public class FoodStorageController {

    private final FoodStorageService foodStorageService;

    @PostMapping
    public FoodStorage createFood(@RequestBody FoodStorage foodStorage) {
        log.info("create food order request received");
        return foodStorageService.createFood(foodStorage);
    }
}
