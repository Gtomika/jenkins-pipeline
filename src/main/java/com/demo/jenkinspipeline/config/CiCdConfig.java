package com.demo.jenkinspipeline.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "ci-cd")
public class CiCdConfig {
    private String agent;
    private String version;
    private String cloud;
}
