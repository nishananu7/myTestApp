package com.example.testapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.models.Contact;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfig {
	
	@Bean
	public Docket displayApi() {
		
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.example"))
				  .build()
	                .apiInfo(metaData());
	    }
	    private ApiInfo metaData() {
	        @SuppressWarnings("deprecation")
			ApiInfo apiInfo = new ApiInfo("Spring Boot Rest API", "Online Store", "", "", "", "", "");
	        return apiInfo;
	}
	
	

}
