package com.example.food_service.api;

import com.example.food_service.model.FoodOrder;
import com.example.food_service.service.FoodOrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class FoodOrderController {

    private final FoodOrderService foodOrderService;

    @PostMapping
    public FoodOrder createFoodOrder(@RequestBody FoodOrder foodOrder) {
        log.info("create food order request received");
        return foodOrderService.createFoodOrder(foodOrder);
    }
}
