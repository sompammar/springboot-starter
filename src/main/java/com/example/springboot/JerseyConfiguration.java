package com.example.springboot;


import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JerseyConfiguration extends ResourceConfig {

    public JerseyConfiguration() {
        packages("com.example.springboot");
        register(new JacksonConfigurator());
    }
}