package kafka.example.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"kafka.example.controller","kafka.example.service"})
public class SpringAppConfig {

	public static void main(String[] args) {
		SpringApplication.run(SpringAppConfig.class, args);
	}

}
