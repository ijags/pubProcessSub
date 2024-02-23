package com.sample.stream;

import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sample.stream.model.Order;
import com.sample.stream.model.OrderStatus;

@Configuration
public class Processor {

    @Bean
    Function<Order, Order> process() {
		return order -> {
			order.setOrderStatus(OrderStatus.PROCESSED);
			System.out.println("Processed Order: " + order.toString());
			return order;
		};
	}
}
