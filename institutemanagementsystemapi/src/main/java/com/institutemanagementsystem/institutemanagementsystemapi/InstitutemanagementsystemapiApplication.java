package com.institutemanagementsystem.institutemanagementsystemapi;

import com.institutemanagementsystem.institutemanagementsystemapi.services.AuthenticationService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.institutemanagementsystem.institutemanagementsystemapi.models.RegisterRequest;

import static com.institutemanagementsystem.institutemanagementsystemapi.models.Role.ADMIN;

@SpringBootApplication
public class InstitutemanagementsystemapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(InstitutemanagementsystemapiApplication.class, args);
	}
/*
	@Bean
	public CommandLineRunner commandLineRunner(
			AuthenticationService service
	) {
		return args -> {
			var admin = RegisterRequest.builder()
					.firstname("Admin")
					.lastname("Admin")
					.email("admin@mail.com")
					.password("password")
					.role(ADMIN)
					.build();
			System.out.println("Admin token: " + service.register(admin));


		};
	}
*/
}
