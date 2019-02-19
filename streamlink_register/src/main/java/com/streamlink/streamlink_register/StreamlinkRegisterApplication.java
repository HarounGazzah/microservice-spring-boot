package com.streamlink.streamlink_register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class StreamlinkRegisterApplication {

	public static void main(String[] args) {
		SpringApplication.run(StreamlinkRegisterApplication.class, args);
	}

}
