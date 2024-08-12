package net.javaguides.expense;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;

@OpenAPIDefinition(
		info = @Info(
				title = "Expense Tracker REST API Documentation",
				description = "Expense tracker",
				version = "v1.0",
				contact = @Contact(
						name = "Aratrik",
						email = "aratrikaratrik@gmail.com",
						url = "https://aratrik-bandyopadhyay.netlify.app/"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://aratrik-bandyopadhyay.netlify.app/"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Expense Tracker REST API Documentation for Developers",
				url = "...."
		)
)
@SpringBootApplication
public class ExpenseTrackerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpenseTrackerAppApplication.class, args);
	}
	@Bean
	public WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> webServerFactoryCustomizer() {
		return factory -> factory.setPort(8081); // Replace 8081 with your desired port
	}
}
