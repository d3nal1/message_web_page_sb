package pl.coderslab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import pl.coderslab.repository.UserRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)

public class MessageWebPageSbApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessageWebPageSbApplication.class, args);
	}

}
