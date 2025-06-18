package com.joaopaulomts.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.minio.MinioClient;

@Configuration
public class MinioClientConfig {
    @Bean
    MinioClient minioClient() {
        return MinioClient.builder().endpoint("http://localhost:9000").credentials("ROOTUSER", "CHANGEME123").build();
    }
}
