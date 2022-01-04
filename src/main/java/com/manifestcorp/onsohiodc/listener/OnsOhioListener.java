package com.manifestcorp.onsohiodc.listener;

import com.manifestcorp.onsdomain.Order;
import com.manifestcorp.onsohiodc.domain.CosmosOrder;
import com.manifestcorp.onsohiodc.repositories.OrderRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class OnsOhioListener {
    Logger logger = LoggerFactory.getLogger(OnsOhioListener.class);

    @Autowired
    OrderRepository orderRepository;


    @KafkaListener(topics = "${k.topic.consumer.name}")
    public void listener(Order order){
        logger.info(order.toString());
        orderRepository.save(order).subscribe();
    }
}
