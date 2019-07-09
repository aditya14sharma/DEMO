package com.aditya.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**This the main class to start the spring boot application
 * @author aditya
 *
 */
@SpringBootApplication
@ComponentScan({"com"})
@EntityScan("com.aditya.entity")
@EnableJpaRepositories("com.aditya.repository")
public class Application  {


	
	/**Main method
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}



}