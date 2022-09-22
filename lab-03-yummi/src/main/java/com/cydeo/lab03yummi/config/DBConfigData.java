package com.cydeo.lab03yummi.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@Data
@ConfigurationProperties(prefix = "db")
public class DBConfigData {

    private String name;
    private String surname;
    private String email;
    private List<String> socialMedia;


}
