package com.fission.socketdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer

public class SocketdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SocketdemoApplication.class, args);
	}

}
