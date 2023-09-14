package com.Back_LoseYourself;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class BackLoseYourselfApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackLoseYourselfApplication.class, args);
	}

}
