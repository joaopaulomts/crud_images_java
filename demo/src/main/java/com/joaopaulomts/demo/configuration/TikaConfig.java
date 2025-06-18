package com.joaopaulomts.demo.configuration;

import org.apache.tika.Tika;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TikaConfig {
    @Bean
    Tika tika() {
        return new Tika();
    }
}
