package com.bianeck.customerregisterapi.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {

    @Value("${spring.application.info.basepackage}")
    private String BASE_PACKAGE;
    @Value("${spring.application.info.title}")
    private String TITLE;
    @Value("${spring.application.info.description}")
    private String DESCRIPTION;
    @Value("${spring.application.info.version}")
    private String VERSION;
    @Value("${spring.application.info.contact.name}")
    private String CONTACT_NAME;
    @Value("${spring.application.info.contact.url}")
    private String CONTACT_URL;
    @Value("${spring.application.info.contact.email}")
    private String CONTACT_EMAIL;

    @Bean
    public OpenAPI customConfiguration() {
        return new OpenAPI()
                .components(new Components())
                .info(getInfo());
    }

    private Info getInfo() {
        return new Info()
                .title(TITLE)
                .description(DESCRIPTION)
                .version(VERSION)
                .contact(getContact());
    }

    private Contact getContact() {
        return new Contact()
                .name(CONTACT_NAME)
                .url(CONTACT_URL)
                .email(CONTACT_EMAIL);
    }
}
