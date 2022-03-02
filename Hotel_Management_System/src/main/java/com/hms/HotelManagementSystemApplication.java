package com.hms;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class HotelManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelManagementSystemApplication.class, args);
	}

	@Bean
	public Docket swaggerConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				/* .paths(PathSelectors.ant("/api/*")) */
				.apis(RequestHandlerSelectors.basePackage("com.hms")).build().apiInfo(apiDetails());
	}

	private ApiInfo apiDetails() {
		return new ApiInfo("U Dummy Hotel", "Online Hotel Management System", "1.0", "Terms of service",
				new Contact("Rohit (Manager)", "www.UDummyHotel.com", "rohit@udummyhotel.com"), "http://UDummyHotel.in",
				"API license URL", Collections.emptyList());
	}

}
