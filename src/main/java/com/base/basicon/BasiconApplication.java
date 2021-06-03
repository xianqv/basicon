package com.base.basicon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class BasiconApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasiconApplication.class, args);
        System.out.println("hello spring boot ");
    }

}
