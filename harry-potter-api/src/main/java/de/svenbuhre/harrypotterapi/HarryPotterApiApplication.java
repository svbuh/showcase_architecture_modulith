package de.svenbuhre.harrypotterapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "de.svenbuhre.harrypotterapi.repository")
@EntityScan(basePackages = "de.svenbuhre.harrypotterapi.model")
public class HarryPotterApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(HarryPotterApiApplication.class, args);
    }

    @Bean(name = "harryPotterRestTemplate")
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}