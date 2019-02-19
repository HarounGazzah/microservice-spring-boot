package com.streamlink.streamlink_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class StreamlinkServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StreamlinkServiceApplication.class, args);
	}

}
