package com.lab604.priceexchangeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class PriceExchangeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PriceExchangeServiceApplication.class, args);
	}

}
