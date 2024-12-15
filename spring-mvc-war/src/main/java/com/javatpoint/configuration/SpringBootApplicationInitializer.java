package com.javatpoint.configuration;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

@Configuration
public class SpringBootApplicationInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

        String LOGGER_JSON_FORMAT = System.getenv("LOGGER_JSON_FORMAT");

        System.out.println("LOGGER_JSON_FORMAT: " + LOGGER_JSON_FORMAT);

        // WebApplicationContext creation
        AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
        webApplicationContext.register(AppConfig.class);
        // DispatcherServlet creation
        DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContext);
        // DispatcherServlet registration
        ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcher", dispatcherServlet);
        dispatcher.addMapping("/");
        dispatcher.setLoadOnStartup(1);
    }
}