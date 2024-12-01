package com.example.movies.config;  // Use the package name where you place the file

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // Allow CORS for /api/movie/** endpoints
        registry.addMapping("/api/movie/**")
                .allowedOrigins("http://localhost:3000")  // Your React frontend origin
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")  // Allowed HTTP methods
                .allowedHeaders("*")  // Allow all headers (you can specify specific ones)
                .allowCredentials(true);  // Allow credentials (cookies, etc.)
    }
}

