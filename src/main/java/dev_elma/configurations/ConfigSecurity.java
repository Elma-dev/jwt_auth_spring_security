package dev_elma.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer;

@Configuration
@EnableWebSecurity

public class ConfigSecurity {
    @Bean
    public  filterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.csrf().disable();
        return httpSecurity.authorizeHttpRequests().anyRequest().permitAll();
    }


}
