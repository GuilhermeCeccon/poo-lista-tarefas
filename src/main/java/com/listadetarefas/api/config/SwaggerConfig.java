package com.listadetarefas.api.config;


import springfox.documentation.swagger2.annotations.EnableSwagger2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


import static springfox.documentation.builders.PathSelectors.regex;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket taskApi() {
		return new Docket(DocumentationType.SWAGGER_2)
		.select()
		.apis(RequestHandlerSelectors.basePackage("com.listadetarefas.api"))
		.paths(regex("/tarefasApi.*"))
		.build()
		.apiInfo(metaInfo());
	}
	
	private ApiInfo metaInfo() {
		ApiInfo apiInfo = new ApiInfo(
		"Lista de Tarefas API REST",
		"API REST de uma lista de tarefas.",
		"1.0",
		"Terms of Service",
		new Contact("POO","Avançado", "IMED"),
		"Apache License Version 2.0",
		"https://www.apache.org/licensen.html", new ArrayList<VendorExtension>()
		);
		
		return apiInfo;
	}
}