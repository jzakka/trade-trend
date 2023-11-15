package com.example.tradetrend.config;

import lombok.SneakyThrows;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
    @SneakyThrows
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http){
        return http
                .cors(corsConfig -> corsConfig.disable())
                .csrf(csrfConfig -> csrfConfig.disable())
                .authorizeHttpRequests(authConfig -> authConfig.anyRequest().permitAll())
                .build();
    }
}
