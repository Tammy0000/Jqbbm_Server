package com.jq.jqbbm_server;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
public class JqbbmServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(JqbbmServerApplication.class, args);
    }

}
