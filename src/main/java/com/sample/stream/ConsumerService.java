package com.sample.stream;

import java.util.function.Consumer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sample.stream.model.Order;
import com.sample.stream.model.OrderStatus;

@Configuration
public class ConsumerService {
	
    @Bean
    Consumer<Order> orderConsume() {
		return order -> {
			order.setOrderStatus(OrderStatus.SHIPPED);
			System.out.println("Completed Order: " + order.toString());
			System.out.println("-----------------------------------");
		};
	}

}
