package com.sample.stream;

import java.util.function.Supplier;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sample.stream.model.Order;
import com.sample.stream.model.OrderStatus;

@Configuration
public class PublisherService {

    @Bean
    Supplier<Order> orderPublish(){
		return () -> {
			Order order = new Order.OrderBuilder().build();
			order.setOrderStatus(OrderStatus.CREATED);
			System.out.println("Published Order: " + order.toString());
			return order;
		};
	}

}
