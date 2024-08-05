package com.example.sbtestazure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SbtestazureApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbtestazureApplication.class, args);
    }

    @GetMapping("/message")
    public String message() {
        return "diu";
    }

}
