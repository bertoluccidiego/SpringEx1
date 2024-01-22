package org.example.config;

import org.example.models.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Parrot parrot1() {
        var parrot = new Parrot();
        parrot.setName("Koko");
        return parrot;
    }

    @Bean(name = "miki")
    Parrot parrot2() {
        var parrot = new Parrot();
        parrot.setName("Miki");
        return parrot;
    }

    @Bean
    Parrot parrot3() {
        var parrot = new Parrot();
        parrot.setName("Riki");
        return parrot;
    }
}