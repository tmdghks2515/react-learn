package com.anan.reactback.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfiguration implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {

        registry
                .addMapping("/**")//모든 요청에 대해서
                .allowedOrigins("http://localhost:3000")
                .allowedOrigins("http://127.0.0.1:3000");


    }
}
