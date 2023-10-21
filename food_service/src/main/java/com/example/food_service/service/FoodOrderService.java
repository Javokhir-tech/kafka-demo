package com.example.food_service.service;

import com.example.food_service.config.ProducerConfig;
import com.example.food_service.model.FoodOrder;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class FoodOrderService {

    private final KafkaTemplate<String, Object> kafkaTemplate;
    private final ProducerConfig producerConfig;
    
    public FoodOrder createFoodOrder(FoodOrder foodOrder) {
        try {
            kafkaTemplate.send(producerConfig.topic().name(), foodOrder);
            return foodOrder;
        } catch (Exception e) {
            log.error("exception when sending message to kafka: {}", e.getMessage());
            throw new RuntimeException();
        }
    }
}
