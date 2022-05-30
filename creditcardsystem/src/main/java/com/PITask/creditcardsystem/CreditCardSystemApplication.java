package com.PITask.creditcardsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages = "com.PITask.creditcardsystem")
@EnableJpaRepositories("com.PITask.creditcardsystem.repository")
@EntityScan("com.PITask.creditcardsystem.model")
public class CreditCardSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreditCardSystemApplication.class, args);
	}

}
