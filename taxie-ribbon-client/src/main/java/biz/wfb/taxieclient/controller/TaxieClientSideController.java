package biz.wfb.taxieclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TaxieClientSideController {
	@LoadBalanced
	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Autowired
	RestTemplate restTemplate;

	@RequestMapping("/taxiclient/frontend/{id}")
	public String hi(@PathVariable String id) {
		String randomString = this.restTemplate.getForObject("https://taxieserver/backend", String.class);
		return "Server Response [" + id + "] :: " + randomString;
	}
	
	@RequestMapping("/client")
	public String home() {
		return "Hello from client ....";
	}
	
}
