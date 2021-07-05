package com.shop.store;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@Slf4j
@SpringBootApplication
public class UserApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(UserApplication.class).run(args);
        log.info("start project");
    }
}
