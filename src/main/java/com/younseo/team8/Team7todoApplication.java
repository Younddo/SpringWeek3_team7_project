package com.younseo.team8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Team7todoApplication {

    public static void main(String[] args) {
        SpringApplication.run(Team7todoApplication.class, args);
    }

}
