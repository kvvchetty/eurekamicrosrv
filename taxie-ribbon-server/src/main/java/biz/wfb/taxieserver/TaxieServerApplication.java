package biz.wfb.taxieserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TaxieServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaxieServerApplication.class, args);
	}
}
