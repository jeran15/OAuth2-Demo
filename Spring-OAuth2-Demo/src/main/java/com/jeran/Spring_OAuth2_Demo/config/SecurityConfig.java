package com.jeran.Spring_OAuth2_Demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception{

        http.authorizeHttpRequests(auth -> auth.anyRequest().authenticated())
                .oauth2Login(Customizer.withDefaults());

        return http.build();
    }
}

//ClientId : 1019085402602-agp8b3tdfu4g7htmll7laqr39do0mgjh.apps.googleusercontent.com
//clientSecret : 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