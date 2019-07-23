package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/rest/client")
public class ClientController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/demo")
	public String invoke() {
		return "Just for Demo";
	}
	
	@HystrixCommand(fallbackMethod = "errorMethod") //This is invoked when My-service is down
	@GetMapping("/callservice")
	public String invokeService() {
		String url="http://My-Service:8081"; //name of service on registry
		return restTemplate.getForObject(url, String.class);//response type is string
	}
	
	public String errorMethod() { //should have same method dec. as above(invokeService)
		/*
		 * String url="http://My-Service:8081"; //name of service on registry return
		 * restTemplate.getForObject(url, String.class);//response type is string
		 */  //if that service is not available then this service		
		return "<h1>Sorry service is dowm !</h1><h3>Please try again</h3>";
	}
	
}
