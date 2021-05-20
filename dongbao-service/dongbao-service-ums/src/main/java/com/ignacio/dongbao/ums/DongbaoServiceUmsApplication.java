package com.ignacio.dongbao.ums;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class DongbaoServiceUmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DongbaoServiceUmsApplication.class, args);
    }

}
