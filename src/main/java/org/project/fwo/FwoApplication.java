package org.project.fwo;

import org.project.fwo.model.user.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FwoApplication.class, args);

		User user = new User();
		user.presentation();
		user.setUsername("Admin");
		user.setPassword("admin");
		user.setEmail("admin@gmail.com");
		user.presentation();

	}

}
