package com.streamlink.streamlink_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class StreamlinkGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(StreamlinkGatewayApplication.class, args);
	}

}
