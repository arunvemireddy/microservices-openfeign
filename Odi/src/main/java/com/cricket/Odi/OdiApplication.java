package com.cricket.Odi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = {"com.cricket"})
@EnableDiscoveryClient
@EnableFeignClients
public class OdiApplication {

	public static void main(String[] args) {
		SpringApplication.run(OdiApplication.class, args);
	}

}
