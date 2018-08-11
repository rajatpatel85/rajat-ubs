package com.rrp.ubs.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class OrderApplication implements WebMvcConfigurer {
	
	public static void main( String[] args ){
        SpringApplication.run(OrderApplication.class, args);
    }
	
	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.rrp.ubs")).paths(PathSelectors.any()).build()
				.apiInfo(generateApiInfo());

	}

	@SuppressWarnings("deprecation")
	private ApiInfo generateApiInfo() {
		return new ApiInfo("UBS Service", "This is a UBS - Order Service", "Version 1.0",
				"", "emailAddress", "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0");
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
		registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
	}
}
