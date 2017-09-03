package com.ben.movie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import javax.xml.ws.WebEndpoint;

@SpringBootApplication
public class MicroserviceSimpleConsumerWebApplication {

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	public static void main(String[] args) {
		SpringApplication.run(MicroserviceSimpleConsumerWebApplication.class, args);
	}
}
