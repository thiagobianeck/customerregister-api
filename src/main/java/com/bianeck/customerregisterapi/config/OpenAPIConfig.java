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

    @Value("${info.app.title}")
    private String TITLE;
    @Value("${info.app.description}")
    private String DESCRIPTION;
    @Value("${info.app.version}")
    private String VERSION;
    @Value("${info.app.contact.name}")
    private String CONTACT_NAME;
    @Value("${info.app.contact.url}")
    private String CONTACT_URL;
    @Value("${info.app.contact.email}")
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
