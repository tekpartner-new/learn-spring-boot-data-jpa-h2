package net.tekpartner.learn.restjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "net.tekpartner.learn.restjpa.persistence.jpa")
@EntityScan("net.tekpartner.learn.restjpa.persistence.model")
public class LearnRestJPAApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnRestJPAApplication.class, args);
    }

}
