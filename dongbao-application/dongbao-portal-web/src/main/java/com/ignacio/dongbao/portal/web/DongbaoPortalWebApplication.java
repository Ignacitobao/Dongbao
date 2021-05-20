package com.ignacio.dongbao.portal.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.ignacio.dongbao.ums"})
public class DongbaoPortalWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(DongbaoPortalWebApplication.class, args);
    }

}
