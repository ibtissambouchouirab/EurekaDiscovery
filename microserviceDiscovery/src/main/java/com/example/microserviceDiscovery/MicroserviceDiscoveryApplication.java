package com.example.microserviceDiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroserviceDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceDiscoveryApplication.class, args);
	}

}
