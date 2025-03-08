package com.dcb.api_gatewary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ApiGatewaryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewaryApplication.class, args);
	}

}
