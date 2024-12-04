package com.example.demo.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.web.SecurityFilterChain

@Configuration
class SecurityConfig {

    @Bean
    fun securityFilterChain(http: HttpSecurity): SecurityFilterChain {
        http.csrf().disable() // Disable CSRF for testing purposes
            .headers { headers ->
                headers.frameOptions().sameOrigin() // Allow same-origin frames
            }
            .authorizeHttpRequests { auth ->
                auth.anyRequest().permitAll() // Allow all requests for now
            }
        return http.build()
    }
}
