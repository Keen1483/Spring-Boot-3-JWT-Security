package com.keen.jwtsecurity;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import com.keen.jwtsecurity.domain.Role;
import com.keen.jwtsecurity.domain.User;
import com.keen.jwtsecurity.service.UserService;

@SpringBootApplication
public class JwtsecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtsecurityApplication.class, args);
	}
	
	/*
	@Bean
	CommandLineRunner run(UserService userService) {
		return arg -> {
			userService.saveRole(new Role(null, "ROLE_USER"));
			userService.saveRole(new Role(null, "ROLE_MANAGER"));
			userService.saveRole(new Role(null, "ROLE_ADMIN"));
			userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));
			
			userService.saveUser(new User(null, "John Doe", "john", "1234", new ArrayList<>()));
			userService.saveUser(new User(null, "Will Talle", "will", "1234", new ArrayList<>()));
			userService.saveUser(new User(null, "Jim Cater", "jim", "1234", new ArrayList<>()));
			userService.saveUser(new User(null, "Rayan Kenfack", "rayan", "1234", new ArrayList<>()));
			
			userService.addRoleToUser("john", "ROLE_USER");
			userService.addRoleToUser("Will", "ROLE_USER");
			userService.addRoleToUser("Will", "ROLE_MANAGER");
			userService.addRoleToUser("jim", "ROLE_ADMIN");
			userService.addRoleToUser("Rayan", "ROLE_SUPER_ADMIN");
			userService.addRoleToUser("Rayan", "ROLE_ADMIN");
			userService.addRoleToUser("Rayan", "ROLE_USER");
		};
	} */

}
