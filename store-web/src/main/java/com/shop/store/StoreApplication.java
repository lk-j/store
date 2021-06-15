package com.shop.store;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * 入口
 * @author lkj
 */
@Slf4j
@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(StoreApplication.class).run(args);
        log.info("start project");
    }
}
