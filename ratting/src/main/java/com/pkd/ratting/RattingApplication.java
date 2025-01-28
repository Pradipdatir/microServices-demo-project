package com.pkd.ratting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RattingApplication {

	public static void main(String[] args) {
		SpringApplication.run(RattingApplication.class, args);
	}

}
