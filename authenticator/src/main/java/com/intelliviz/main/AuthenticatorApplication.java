package com.intelliviz.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class AuthenticatorApplication {
    public static void main(String[] args) {
        SpringApplication.run(AuthenticatorApplication.class, args);
    }

    @GetMapping("/")
    public String getHelloString() {
        return "Hello from Spring Boot";
    }
}
