package Tablefinderapp.Springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "Tablefinderapp.Springboot")
@EntityScan(basePackages = "Tablefinderapp.Springboot")
public class SpringbootJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJavaApplication.class, args);
	}
}
