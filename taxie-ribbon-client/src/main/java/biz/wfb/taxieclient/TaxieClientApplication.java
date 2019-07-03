package biz.wfb.taxieclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import biz.wfb.taxieclient.config.TaxieConfiguration;

@EnableDiscoveryClient
@SpringBootApplication
@RibbonClient(name = "taxieserver", configuration = TaxieConfiguration.class)
public class TaxieClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaxieClientApplication.class, args);
	}
}
