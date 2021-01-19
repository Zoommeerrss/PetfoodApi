/**
 * 
 */
package com.petfood.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

/**
 * @author Emerzoom
 *
 */ 
@Configuration
public class OpenApiConfig {
 
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .components(new Components())
                .info(apiInfo());
    }

    /**
     * Build Api apiInfo
     * 
     * @return Info
     */
	private Info apiInfo() {
		return new Info()
				.title("Petfood Api")
				.description("This is an api service to be used in the Petfood GUI")
				.version("1.0")
				.contact(contactInfo());
	}

    /**
     * Build Api contactInfo
     * 
     * @return Contact
     */
	private Contact contactInfo() {
		return new Contact()
					.name("Emerson Souza")
					.email("emerzoom");
	}
}
