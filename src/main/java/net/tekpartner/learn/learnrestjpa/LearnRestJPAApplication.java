package net.tekpartner.learn.learnrestjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "net.tekpartner.learn.learnrestjpa.persistence.jpa")
@EntityScan("net.tekpartner.learn.learnrestjpa.persistence.model")
public class LearnRestJPAApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(LearnRestJPAApplication.class, args);
    }

}
