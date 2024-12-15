package com.javatpoint.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = {
        "com.javatpoint",
        "com.javatpoint.adapter.entity",
        "com.javatpoint.presentation.entrypoint",
        "com.javatpoint.configuration",
        "com.javatpoint.adapter.repository",
        "com.javatpoint.domain.service",
        "com.javatpoint.domain.service.impl",
})
@EnableWebMvc
public class AppConfig {

}
