package com.example.demo;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@EnableDiscoveryClient //Can discover other services
public class ClientConfig {

	@LoadBalanced //It is to denote that one MS is calling other MS. (Making resources available for all by disturbing)
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
